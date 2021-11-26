package fr.eni.ecole.POO.dessin.entite;

public class Rectangle {

	private Double longueur;
	private Double largeur;
	
	public Rectangle() {
	}
	
	public Rectangle(Double lo, Double la) {
		this.longueur = lo;
		this.largeur = la;
	}
	
	public Double getPerim() {
		return (this.longueur+this.largeur)*2;
	}
	
	public Double getAire() {
		return this.longueur* this.largeur;
	}

	public Double getLongueur() {
		return longueur;
	}

	public void setLongueur(Double longueur) {
		this.longueur = longueur;
	}

	public Double getLargeur() {
		return largeur;
	}

	public void setLargeur(Double largeur) {
		this.largeur = largeur;
	}
	
	
	
}
