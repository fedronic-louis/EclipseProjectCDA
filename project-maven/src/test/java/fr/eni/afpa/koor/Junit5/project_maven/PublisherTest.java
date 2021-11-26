package fr.eni.afpa.koor.Junit5.project_maven;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class PublisherTest {

    private static final String sendedMessage = "Hello World";
    private static final String receivedMessage = "HELLO WORLD";
    
    @Mock
    private Subscriber subscriber1;

    @Mock
    private Subscriber subscriber2;
    
    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }
    
    @Test 
    public void testScenarioSuccess() throws Exception {
        
        // Partie 1 : création de deux mocks.
        Publisher publisher = new Publisher();
        publisher.addSubscriber( subscriber1 );
        publisher.addSubscriber( subscriber2 );

        // Partie 2 : on injecte nos implémentations dans le mock
        Mockito.when( subscriber1.init() ).thenReturn( true );
        Mockito.when( subscriber1.destroy() ).thenReturn( true );

        Mockito.when( subscriber2.init() ).thenReturn( true );
        Mockito.when( subscriber2.destroy() ).thenReturn( true );

        // Partie 3 : On lance le test.
        publisher.init();
        publisher.publish( sendedMessage );
        publisher.destroy();
        
        // Partie 4 : On vérifie les attentes.
        Mockito.verify( subscriber1 ).init();
        Mockito.verify( subscriber1 ).receive( receivedMessage );
        Mockito.verify( subscriber1 ).destroy();
        
        Mockito.verify( subscriber1, Mockito.times( 1 ) ).init();
        Mockito.verify( subscriber2 ).receive( receivedMessage );
        Mockito.verify( subscriber1, Mockito.times( 1 ) ).destroy();
    }

}