package fr.eni.afpa.koor.Junit5;

public interface Subscriber {


    public boolean init();
    
    public void receive( String theMessage );
    
    public boolean destroy();
    
    // Plein de méthodes qui ne servent à rien dans notre scénario de test,
    // mais qui doivent être implémentées dans notre mock.
    public void demoX();
    public void demoY();
    public void demoZ();
    
}