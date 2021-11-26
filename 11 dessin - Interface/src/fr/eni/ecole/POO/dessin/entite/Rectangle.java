package fr.eni.ecole.POO.dessin.entite;

public class Rectangle extends Forme implements Comparable<Rectangle>,Dessinable{

	private Double longueur;
	private Double largeur;
	
	public Rectangle() {
	}
	
	public void printInfo() {
		System.out.println("Ceci est un rectangle de "+longueur+ " sur "+ largeur);
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

	@Override
	public int compareTo(Rectangle rec) {
		return this.getPerim().compareTo(rec.getPerim());
	}

	@Override
	public void dessiner() {
		for (int i = 0; i < longueur; i++) {
			for (int j = 0; j < largeur; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	
}
