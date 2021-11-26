package fr.eni.ecole.POO.groupeEleves.entite;

import java.util.Date;

public class Eleve extends Personne implements Comparable <Eleve>{

	/*private Personne nom;
	private Personne prenom;
	private Personne adresse;
	private Personne ddn;*/
	private int note;
	private Parent referent ; 	
	
	
	public Parent getReferent() {
		return referent;
	}
	public void setReferent(Parent referent) {
		this.referent = referent;
	}
	


	
	public Eleve() {
		// TODO Auto-generated constructor stub
	}
	public Eleve(String nom, String prenom, String adresse, Date ddn,int note) {
		
		super(nom,prenom,adresse,ddn);
		this.note=note;
		// TODO Auto-generated constructor stub
	}
	public Eleve(String nom, String prenom, String adresse, Date ddn) {
		super(nom,prenom,adresse,ddn);
		// TODO Auto-generated constructor stub
	}
	public int compareTo(Eleve o) {
		return this.prenom.compareTo(o.prenom);
	}
    @Override public String toString() {
        
    	// ce return évite de mettre le bloc de commentaire (private +ce qui est en dessous)
    	return super.toString();
    	/*return String.format( "%d: %s %s @ %s",
                this.nom,
                this.prenom,
                this.adresse,
                this.ddn );*/
    }
}
