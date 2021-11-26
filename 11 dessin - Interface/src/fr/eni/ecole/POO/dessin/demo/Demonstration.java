package fr.eni.ecole.POO.dessin.demo;

import java.util.ArrayList;
import java.util.List;

import fr.eni.ecole.POO.dessin.entite.Carre;
import fr.eni.ecole.POO.dessin.entite.Cercle;
import fr.eni.ecole.POO.dessin.entite.Dessinable;
import fr.eni.ecole.POO.dessin.entite.Forme;
import fr.eni.ecole.POO.dessin.entite.Personne;
import fr.eni.ecole.POO.dessin.entite.Rectangle;

public class Demonstration {
	
	public static void main(String[] args) {
		Rectangle r = new Rectangle(2.3, 4.5);
		Carre c = new Carre(2.3);
		Rectangle r2 = new Rectangle(2.0, 3.0);
		Carre c2 = new Carre(5.0);
		Carre c3 = new Carre(7.2);
		Cercle ce = new Cercle(3.0);
		
		List<Forme> lst = new ArrayList<Forme>();
		lst.add(r);
		lst.add(c);
		lst.add(r2);
		lst.add(c2);
		lst.add(c3);
		lst.add(ce);

		// dessiner les formes
		for (Forme forme : lst) {
			if(forme instanceof Dessinable) {
				((Dessinable) forme).dessiner();
			}
		}
		
		Personne p = new Personne();
		p.dessiner();
	}

}
