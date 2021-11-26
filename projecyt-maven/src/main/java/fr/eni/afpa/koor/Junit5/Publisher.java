package fr.eni.afpa.koor.Junit5;

import java.util.ArrayList;

public class Publisher {

    private ArrayList<Subscriber> subscribers = new ArrayList<Subscriber>(); 
    
    
    public void addSubscriber( Subscriber subsc ) {
        this.subscribers.add( subsc );
    }
    
    
    public void init() {
        for( Subscriber subscriber : this.subscribers ) {
            if ( subscriber.init() == false ) {
                throw new RuntimeException();
            }
        }
    }
    
    public void publish( String message ) {
        for( Subscriber subscriber : this.subscribers ) {
            subscriber.receive( message.toUpperCase() );
        }       
    }

    public void destroy() {
        for( Subscriber subscriber : this.subscribers ) {
            if ( subscriber.destroy() == false ) {
                throw new RuntimeException();
            }
        }
        this.subscribers.clear();
    }
}
   