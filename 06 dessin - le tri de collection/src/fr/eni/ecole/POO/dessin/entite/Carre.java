package fr.eni.ecole.POO.dessin.entite;

public class Carre extends Rectangle {

	public Carre() {
	}
	
	public Carre(Double cote) {
		super(cote,cote);
	}
	
	public void setCote(Double cote) {
		super.setLargeur(cote);
		super.setLongueur(cote);
	}
	
	@Override
	public void printInfo() {
		System.out.println("Ceci est un carré de "+super.getLongueur());

	}
}
