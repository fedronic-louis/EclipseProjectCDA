package fr.eni.ecole.POO.dessin.demo;

import java.util.ArrayList;
import java.util.List;

import fr.eni.ecole.POO.dessin.entite.Carre;
import fr.eni.ecole.POO.dessin.entite.FormeException;
import fr.eni.ecole.POO.dessin.entite.Rectangle;

public class Demonstration {
	private static void recapElement(List<Rectangle> lst, int i) throws FormeException {
		try {
			Rectangle r = lst.get(i);
			System.out.println("le périmètre est de " + r.getPerim());
			System.out.println("l'aire est de " + r.getAire());
		} catch (IndexOutOfBoundsException e) {
			throw new FormeException("Dépassement de la capacité de la liste des formes");
		}

	}

	public static void main(String[] args) {
		Rectangle r = new Rectangle(2.3, 4.5);
		Carre c = new Carre(2.3);
		Rectangle r2 = new Rectangle(2.0, 3.0);
		Carre c2 = new Carre(5.0);
		Carre c3 = new Carre(7.2);

		List<Rectangle> lst = new ArrayList<Rectangle>();
		lst.add(r);
		lst.add(c);
		lst.add(r2);
		lst.add(c2);
		lst.add(c3);

		// gestion des exceptions
		for(int j=0; j<= lst.size(); j++) { //petite modif pour parcourir ma liste List<Rectangle>
			try {
				recapElement(lst, j);
			} catch (FormeException e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
