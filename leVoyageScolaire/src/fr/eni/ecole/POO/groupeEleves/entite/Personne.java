package fr.eni.ecole.POO.groupeEleves.entite;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.regex.Pattern;

public class Personne {
	
	protected String nom;
    protected String prenom;
    protected String adresse;
    protected Date ddn;
    

	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
        if ( nom == null ) {
            throw new NullPointerException( "l'espace nom ne peut être vide" );
        }
        nom = nom.trim();   // Pour supprimer les blancs inutiles
        if ( nom.equals( "" ) ) {
            throw new RuntimeException( "l'espace nom ne peut être vide" );
        }
		this.nom = nom.toUpperCase();
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
        if ( prenom == null ) {
            throw new NullPointerException( "l'espace prenom ne peut pas être vide" );
        }
        prenom = prenom.trim();   // Pour supprimer les blancs inutiles
        if ( prenom.equals( "" ) ) {
            throw new RuntimeException( "l'espace prenom ne peut pas être vide" );
        }
		this.prenom = prenom.toLowerCase();
	}


	public String getAdresse() {
		return adresse;
	}


	public void setAdresse(String adresse) {
        if ( adresse == null ) {
            throw new NullPointerException( "l'espace adresse ne peut pas être vide" );
        }
        adresse = adresse.trim();   // Pour supprimer les blancs inutiles
        if ( adresse.equals( "" ) ) {
            throw new RuntimeException( "l'espace adresse ne peut pas être vide" );
        }
		this.adresse = adresse;
	}


	public Date getDdn() {
		return ddn;
	}


	public void setDdn(Date ddn) {
        if ( ddn == null ) {
            throw new NullPointerException( "la date d'anniversaire Doit être rempli" );
        }
		this.ddn = ddn;
	}


	public Personne() {
		
		//this("charles","henry","38 Baltazar 31500", sdf.parse("28/05/1973"));
		
		// TODO Auto-generated constructor stub
		
	}
	public Personne(String nom, String prenom, String adresse, Date ddn) {
		// TODO Auto-generated constructor stub
        this.setNom(nom);
        this.setPrenom(prenom);
        this.setAdresse(adresse);
        this.setDdn(ddn);
	}


	@Override
	public String toString() {
		return " \n Personne " +" \n "+ nom +" "+ prenom + " \n "+ adresse + " \n "+ ddn + "\n";
	}

}
