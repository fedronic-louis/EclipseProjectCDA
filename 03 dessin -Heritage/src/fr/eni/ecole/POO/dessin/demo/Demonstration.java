package fr.eni.ecole.POO.dessin.demo;

import fr.eni.ecole.POO.dessin.entite.Carre;
import fr.eni.ecole.POO.dessin.entite.Rectangle;

public class Demonstration {

	public static void main(String[] args) {
		Rectangle r = new Rectangle(2.3, 4.5);
		System.out.println("l'aire du rectangle est " + r.getAire());
		System.out.println("le périmètre du rectangle est " + r.getPerim());

		Carre c = new Carre(2.3);
		System.out.println("l'aire du carré est "+ c.getAire());
		System.out.println("le périmètre du carré est "+c.getPerim());
	}

}
