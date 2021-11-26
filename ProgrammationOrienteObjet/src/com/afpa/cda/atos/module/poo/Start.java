package com.afpa.cda.atos.module.poo;

/*
public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      Rational r = new Rational();
	        r.setNumerator(20);
	        r.setDenominator(1);
	        
	        // Affiche [1/3]
	        System.out.printf( "[%d/%d]\n", r.getNumerator(), r.getDenominator() );
	       
	        // Do something
	        
	        float result = r.getNumerator() / r.getDenominator();
	        System.out.printf( "[%d/%d] => %f\n", r.getNumerator(), r.getDenominator(), result );
	    
	}

}
*/
/*public class Start {

	public static void main(String[] args) {

		Rational r = new Rational();
		System.out.printf("[%d/%d]\n", r.getNumerator(), r.getDenominator()); // ???

		r.setNumerator(1);
		r.setDenominator(3);
		System.out.printf("[%d/%d]\n", r.getNumerator(), r.getDenominator()); // [1/3]

	}

}*/
										
/**
 * 
 * @author 31010-12-05 
 										* CHAPITRE 1
 */
/*public class Start {

    public static void main( String [] args ) {
    
        Rational r1 = new Rational();
        System.out.printf( "[%d/%d]\n", r1.getNumerator(), r1.getDenominator() );

        Rational r2 = new Rational( 2 );
        System.out.printf( "[%d/%d]\n", r2.getNumerator(), r2.getDenominator() );

        Rational r3 = new Rational( 1, 3 );
        System.out.printf( "[%d/%d]\n", r3.getNumerator(), r3.getDenominator() );
    
    }
   
}*/


										
/**
 * 
 * @author 31010-12-05
 										* CHAPITRE 2 surcharge constructeurs et utilisation de ces derniers
 */
public class Start {

    public static void main( String [] args ) {
    
    	/**
    	 * PARTIE 1 ON INSTANCIE DES CLASSES EN AJOUTANT DIFFEREMMENT DES ATTRIBUTS
    	 */
    	
    	/*
        Rational r1 = new Rational();
        System.out.printf( "[%d/%d]\n", r1.getNumerator(), r1.getDenominator() );

        Rational r2 = new Rational( 2 );
        System.out.printf( "[%d/%d]\n", r2.getNumerator(), r2.getDenominator() );

        Rational r3 = new Rational( 1, 3 );
        System.out.printf( "[%d/%d]\n", r3.getNumerator(), r3.getDenominator() );

        
       	Rational r4 = new Rational( 3.5 ); // CELA AFFICHERA UN FLOAT DONT ON VISUALISERA SON MULTIPLE DE 10
        System.out.printf( "[%d/%d]\n", r4.getNumerator(), r4.getDenominator() );
        */
    	
    	/**
    	 * PARTIE 2 IDENTIQUE A LA PARTIE 1 / ON UTILISE TOSTRING POUR AFFICHER MESSAGE STANDARD 
    	 */
    	/*Rational r1 = new Rational();
        System.out.print( r1 );

        Rational r2 = new Rational( 2 );
        System.out.print( r2 );

        Rational r3 = new Rational( 1, 3 );
        System.out.printf( r3.toString() );

        Rational r4 = new Rational( 3.5 );
        String message = "r4 == " + r4;
        System.out.printf( message );*/
    
    	Rational r1 = new Rational( 1, 3 );
        Rational r2 = new Rational( 2, 1 );
        Rational result = r1.add( r2 );
        System.out.println( result );
        
        if ( ! result.eq( new Rational( 7, 3 ) ) ) {
            throw new RuntimeException( 
                    "Certainnement un pb d'addition ou de comparaison" );
        }
    
        Rational r3 = new Rational( 3.5 );
        System.out.println( r3 );
        if ( ! r3.eq( new Rational( 7, 2 ) ) ) {
            throw new RuntimeException( 
                    "Certainnement un pb de simplification" );
        }
     
        System.out.println( "Tout semble OK :-)" );
    
    
    
    }

}

/**
 * 
 * @author 31010-12-05
 										* CHAPITRE 3 SIMPLIFY
 */