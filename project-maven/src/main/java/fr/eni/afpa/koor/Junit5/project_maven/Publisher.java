package fr.eni.afpa.koor.Junit5.project_maven;
import java.util.ArrayList;

public class Publisher {
	//On crée une variable tableau appelé subscribers et on l'instancie 
    private ArrayList<Subscriber> subscribers = new ArrayList<Subscriber>(); 
    
    
    public void addSubscriber( Subscriber subsc ) { // constructeur permet d'ajouter element au tableau 
        this.subscribers.add( subsc );
    }
    
    /**
     *	Le programe va agir sur le tableau nommé subscribers en 4 étapes 
     */
    		/**
    		 *	Etape 1 : initier le tableau subscribers 
    		 */
    public void init() { // on initialise subscriber avec la fonction init()
        for( Subscriber subscriber : this.subscribers ) {
            if ( subscriber.init() == false ) {
                throw new RuntimeException();
            }
        }
    }
    		/**
    		 *	Etape 2 : remplir le tableau subscribers de String message 
    		 */
    public void publish( String message ) { // méthode pour remplir le tableau de String message
        for( Subscriber subscriber : this.subscribers ) {
            subscriber.receive( message.toUpperCase() );
        }       
    }
			/**
			 *	Etape 3 : stopper le processus de remplissage du tableau subscribers 
			 */
    public void destroy() {
        for( Subscriber subscriber : this.subscribers ) {
            if ( subscriber.destroy() == false ) { //subscriber.destroy() est une méthode pour terminer ou simplement tuer une procédure
                throw new RuntimeException();
            }
        }
			/**
			*	Etape 4 : vider le tableau subscribers de son contenu  
			*/
        this.subscribers.clear(); //clear() va permettre de supprimer tous les éléments du set EXISTANT !
    }
    
}