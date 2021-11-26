/**
 * 
 */
package com.afpa.cda.atos.module.poo2;

/**
 * @author 31010-12-05
 *
 */
public class Start {

    public static void main( String [] args ) {
        
        Person john = new Person();
        Person jason = new Person( 1, "Jason", "Bourne", "supremacy@cia.us" );
        Person james = new Person( 7, "James", "Bond", "007@mi6.uk" );
        
        System.out.println( john );
        System.out.println( jason );
        System.out.println( james );
        
        Person nimportnaouak = new Person( 0, "bidon", "kapabonmail", "zut" );
        System.out.println( nimportnaouak );
        
    }

}
