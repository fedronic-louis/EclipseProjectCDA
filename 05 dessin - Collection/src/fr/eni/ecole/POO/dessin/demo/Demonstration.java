package fr.eni.ecole.POO.dessin.demo;

import java.util.ArrayList;
import java.util.List;

import fr.eni.ecole.POO.dessin.entite.Carre;
import fr.eni.ecole.POO.dessin.entite.Rectangle;

public class Demonstration {

	public static void main(String[] args) {
		Rectangle r = new Rectangle(2.3, 4.5);
		Carre c = new Carre(2.3);
		Rectangle r2 = new Rectangle(2.0, 3.0);
		Carre c2 = new Carre(5.0);
		Carre c3 = new Carre(7.2);

		List<Rectangle> lst = new ArrayList<Rectangle>();
		System.out.println(lst.size());

		lst.add(r);
		lst.add(c);
		lst.add(r2);
		lst.add(c2);
		lst.add(c3);

		System.out.println(lst.size());

		Rectangle trouve = lst.get(0);
		trouve.printInfo();

		lst.remove(0);

		trouve = lst.get(0);
		trouve.printInfo();

		System.out.println("PARCOURS DE LA LISTE");
		for (Rectangle forme : lst) {
			forme.printInfo();
		}

		System.out.println("PARCOURS DES CARRES");
		for (Rectangle forme : lst) {
			if (forme instanceof Carre) {
				forme.printInfo();
			}
		}
	}

}
