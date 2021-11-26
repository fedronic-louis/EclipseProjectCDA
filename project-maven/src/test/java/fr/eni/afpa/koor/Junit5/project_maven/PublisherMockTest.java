package fr.eni.afpa.koor.Junit5.project_maven;


import java.lang.reflect.Field;
import java.util.ArrayList;

import org.jmock.Expectations;
import org.jmock.Mockery;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class PublisherMockTest {

    private static final String sendedMessage = "Hello World";
    private static final String receivedMessage = "HELLO WORLD";
    
    private Mockery mockContext1 = null;
    private Mockery mockContext2 = null;
    
    @BeforeEach 
    public void setUp() {
        mockContext1 = new Mockery();
        mockContext2 = new Mockery();
    }
    
    @Test 
    public void testScenarioSuccess() throws Exception {
        Publisher publisher = new Publisher();        

        // Partie 1 : création de deux mocks.
        final Subscriber subscriber1 = mockContext1.mock( Subscriber.class );
        publisher.addSubscriber( subscriber1 );

        final Subscriber subscriber2 = mockContext2.mock( Subscriber.class );
        publisher.addSubscriber( subscriber2 );

        // Partie 2 : nos attentes sont injectées dans les mocks.
        mockContext1.checking( new Expectations() {{
            // Un appel à la méthode init est requis et elle doit retourner true. 
            oneOf( subscriber1 ).init();        will( returnValue( true ) );
            // Un appel à la méthode receive est requis avec la valeur spécifiée
            // en paramètre ("HELLO WORLD").
            oneOf( subscriber1 ).receive( receivedMessage );
            // Un appel à la méthode destroy est requis et elle doit retourner true. 
            oneOf( subscriber1 ).destroy();     will( returnValue( true ) );
        }});
        mockContext2.checking( new Expectations() {{
            oneOf( subscriber2 ).init();        will( returnValue( true ) );
            oneOf( subscriber2 ).receive( receivedMessage );
            oneOf( subscriber2 ).destroy();     will( returnValue( true ) );
        }});
        
        // Partie 3 : On lance le test.
        publisher.init();
        publisher.publish( sendedMessage );
        publisher.destroy();
        
        // Partie 4 : On vérifie les attentes.
        mockContext1.assertIsSatisfied();
        mockContext2.assertIsSatisfied();
    }
    
    
    @Test
    public void testScenarioFailure() throws Exception {
        Assertions.assertThrows( RuntimeException.class, () -> {
            Publisher publisher = new Publisher();        

            // Partie 1 : création d'un mock.
            final Subscriber subscriber1 = mockContext1.mock( Subscriber.class );
            publisher.addSubscriber( subscriber1 );
    
            // Partie 2 : nos attentes sont injectées dans le mock.
            mockContext1.checking( new Expectations() {{
                oneOf( subscriber1 ).init();        will( returnValue( false ) );
                oneOf( subscriber1 ).receive( receivedMessage );
                oneOf( subscriber1 ).destroy();     will( returnValue( true ) );
            }});
            
            // Partie 3 : on lance le test.
            publisher.init();
            publisher.publish( sendedMessage );
            publisher.destroy();
            
            // Partie 4 : on vérifie les attentes.
            mockContext1.assertIsSatisfied();
        });
    }

}