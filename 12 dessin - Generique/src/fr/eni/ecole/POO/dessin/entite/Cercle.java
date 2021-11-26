package fr.eni.ecole.POO.dessin.entite;

public class Cercle extends Forme{
	private Double rayon;
	
	public Cercle() {
	}

	public Cercle(Double rayon) {
		super();
		this.rayon = rayon;
	}

	public Double getRayon() {
		return rayon;
	}

	public void setRayon(Double rayon) {
		this.rayon = rayon;
	}

	@Override
	public Double getAire() {
		return Math.PI* rayon * rayon;
	}

	
	
}
