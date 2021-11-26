package fr.eni.ecole.POO.dessin.demo;

import fr.eni.ecole.POO.dessin.entite.Carre;
import fr.eni.ecole.POO.dessin.entite.Rectangle;

public class Demonstration {

	public static void main(String[] args) {
		Rectangle r = new Rectangle(2.3, 4.5);

		Carre c = new Carre(2.3);
		
		r.printInfo();
		c.printInfo();
	}

}
