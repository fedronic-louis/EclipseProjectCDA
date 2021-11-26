package fr.eni.afpa.koor.Junit5.project_maven;

public interface Subscriber {

	/**
	 * Etape initié de la meme façon que Publisher
	 * @return
	 */
    public boolean init();
    
    public void receive( String theMessage );
    
    public boolean destroy();
    
    // Plein de méthodes qui ne servent à rien dans notre scénario de test,
    // mais qui doivent être implémentées dans notre mock.
    public void demoX();
    public void demoY();
    public void demoZ();


}