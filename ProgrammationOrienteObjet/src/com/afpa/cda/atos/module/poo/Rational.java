package com.afpa.cda.atos.module.poo;
//TODO: Auto-generated Javadoc
/**
 * 
 * @author 31010-12-05
 * cours suivi : https://koor.fr/Java/Tutorial/java_poo_encapsulation.wp#vocabulaire
 *
 */

public class Rational {
										
											/**
											 * Chapitre 1 : ATTRIBUT PUBLIC/PRIVATE ; EXCEPTION DANS SETTER ; CONSTRUCTEURS.  
											 */
	
	 
	//public int numerator;
    //public int denominator;
									
							// --- Nos deux attributs ---
	//1 private int numerator;
	//1 private int denominator;
    
    
    						// Le constructeur !!! Pas de void et il s'appelle Rational !
	//1 public Rational() {
	//1 this.setNumerator(0);
	//1 this.setDenominator(1);
	//1 }
    						//End constructeur
    
    						//Surcharge de constructeur
	//1 public Rational( int numerator ) {
	//1 this.setNumerator( numerator );
	//1 this.setDenominator( 1 );
	//1 }
    
	//1 public Rational( int numerator, int denominator ) {
	//1 this.setNumerator( numerator );
	//1 this.setDenominator( denominator );
	//1 }
    						//End surcharge
    
    						//Créer getter setter via Eclipse en partant d'un clic droit à la variable private
    
    /**
     * Clic droit sur numerator
     * Source --> Generate Getter Setter
     * selectionner les variables puis définir si vous voulez que ce qui soit créer soit au dessus ou en dessous de l'emplacement des variables
     * valider la fenetre et c'est Fait !! 
     * 
     */
	//1 public int getNumerator() {
	//1 return numerator;
	//1 }
	//1 public void setNumerator(int numerator) {
	//1 	this.numerator = numerator;
	//1 }
	//1 public int getDenominator() {
	//1 return denominator;
	//1 }
	//1 public void setDenominator(int denominator) {
	//1 if(denominator==0) throw new RuntimeException ("denominator cannot be zero");
	//1 this.denominator = denominator;
	//1 }
	
	
		 
											/**
											 * CHAPITRE 2 : DELEGATION DE CONSTRUCTEURS ; SURCHARGE DE CONSTRUCTEURS. 
											 */

	    					// --- Nos deux attributs ---
	//2 private int numerator;
	//2   private int denominator;
	    
	    					// --- Quatre constructeurs (avec surcharges et délégations) ---
	//2 public Rational() {
	//2       this( 0, 1 );           // Une délégation de constructeur
	//2   }
	    
	//2   public Rational( int numerator ) {
	//2       this( numerator, 1 );   // Une autre
	//2   }
	    
	//2  public Rational( int numerator, int denominator ) {
	//2      this.setNumerator( numerator );
	//2       this.setDenominator( denominator );
	//2   }
	    
	//2   public Rational( double value ) {
	//2       this.denominator = 1;
	        // On teste s'il y a des chiffres après la virgule
	//2        while( value != (int) value ) {
	            // on multiplie chacune des deux parties par 10
	//2           value *= 10;
	//2           this.denominator *= 10;
	//2        }
	        // value devient notre numérateur
	//2      this.numerator = (int) value;
	//2   }
	    
	    					// --- Nos deux propriétés (getters/setters) ---
	//2  public int getNumerator() {
	//2       return numerator;
	      //2   }
	    
	//2    public void setNumerator( int numerator ) {
	//2      this.numerator = numerator;
	//2   }
	    
	    
	//2  public int getDenominator() {
	//2       return denominator;
	//2   }
	    
	//2    public void setDenominator( int denominator ) {
	//2       if ( denominator == 0 ) throw new RuntimeException( "denominator cannot be zero" );
	//2       this.denominator = denominator;
	//2  }
	    					// --- Quelques méthodes de la classe ---
	    					// Définition de la méthode toString

	//2	    @Override 
	  //2	    public String toString() {
	  //2        return String.format( "[%d/%d]", this.numerator, this.denominator );
	  //2    }

											/**
											 * CHAPITRE 3 ET SI ON PARLAIT DE SIMPLIFY
											 */
	 // --- Nos deux attributs ---
    private int numerator;
    private int denominator;
    
    // --- Quatre constructeurs (avec surcharges et délégations) ---
    public Rational() {
        this( 0, 1 );           // Une délégation de constructeur
    }
    
    public Rational( int numerator ) {
        this( numerator, 1 );   // Une autre
    }
    
    public Rational( int numerator, int denominator ) {
        this.setNumerator( numerator );
        this.setDenominator( denominator );
        this.simplify();
    }
    
    public Rational( double value ) {
        this.denominator = 1;
        // On teste s'il y a des chiffres après la virgule
        while( value != (int) value ) {
            // on multiplie chacune des deux parties par 10
            value *= 10;
            this.denominator *= 10;
        }
        // value devient notre numérateur
        this.numerator = (int) value;
        this.simplify();
    }
    
    // --- Nos deux propriétés (getters/setters) ---
    public int getNumerator() {
        return numerator;
    }
    
    public void setNumerator( int numerator ) {
        this.numerator = numerator;
    }
    
    
    public int getDenominator() {
        return denominator;
    }
    
    public void setDenominator( int denominator ) {
        if ( denominator == 0 ) throw new RuntimeException( "denominator cannot be zero" );
        this.denominator = denominator;
    }
    
    // Quelques méthodes de la classe
    
    public Rational add( Rational r2 ) {
        int numerator = this.numerator * r2.denominator + this.denominator * r2.numerator;
        int denominator = this.denominator * r2.denominator;
        return new Rational( numerator, denominator );
    }
    
    public boolean eq( Rational r2 ) {
        return this.numerator * r2.denominator == this.denominator * r2.numerator;
    }
    
    // Pour les détails sur l'algorithme d'Euclide pour le calcul du PGCD
    // https://fr.wikipedia.org/wiki/Algorithme_d%27Euclide#Description_de_l'algorithme
    public void simplify() {
        int a;
        int b;
        
        if ( this.numerator > this.denominator ) {
            a = this.numerator;
            b = this.denominator;
        } else {
            a = this.denominator;
            b = this.numerator;
        }
        
        int rest;
        while( (rest = a % b) != 0 ) {
            a = b;
            b = rest;
        }
        
        this.numerator /= b;
        this.denominator /= b;
    }    
    
    
    @Override 
    public String toString() {
        return String.format( "[%d/%d]", this.numerator, this.denominator );
    }
    
	
}