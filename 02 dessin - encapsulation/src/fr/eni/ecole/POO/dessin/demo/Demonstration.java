package fr.eni.ecole.POO.dessin.demo;

import fr.eni.ecole.POO.dessin.entite.Rectangle;

public class Demonstration {

	public static void main(String[] args) {
		Rectangle r = new Rectangle(2.3,4.5);
		
		Double aire = r.getAire();
		System.out.println("l'aire est "+aire);
		
		Rectangle r2 = new Rectangle();
		r2.setLargeur(2.3);
		r2.setLongueur(3.9);
		
		System.out.println(r2.getPerim());

	}

}
