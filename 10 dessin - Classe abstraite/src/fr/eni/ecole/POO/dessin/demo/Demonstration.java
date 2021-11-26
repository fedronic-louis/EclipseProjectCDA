package fr.eni.ecole.POO.dessin.demo;

import java.util.ArrayList;
import java.util.List;

import fr.eni.ecole.POO.dessin.entite.Carre;
import fr.eni.ecole.POO.dessin.entite.Cercle;
import fr.eni.ecole.POO.dessin.entite.Dessinable;
import fr.eni.ecole.POO.dessin.entite.Feuille;
import fr.eni.ecole.POO.dessin.entite.Forme;
import fr.eni.ecole.POO.dessin.entite.FormeException;
import fr.eni.ecole.POO.dessin.entite.Personne;
import fr.eni.ecole.POO.dessin.entite.Rectangle;

public class Demonstration {
	
	public static void main(String[] args) {
		
		Feuille f= new Feuille(10.2,20.2);
		Rectangle r = new Rectangle(2.3, 4.5);
		Carre c = new Carre(2.3);
		Rectangle r2 = new Rectangle(2.0, 3.0);
		Carre c2 = new Carre(5.0);
		Carre c3 = new Carre(7.2);
		Cercle ce = new Cercle(3.0);


		try {
			f.addForme(r);
			f.addForme(c);
			f.addForme(r2);
			f.addForme(c2);
			f.addForme(c3);
			f.addForme(ce);
			// Si on continue à rajouter alors on arrivera à l'exception "plus de place"
			System.out.println("espaceOccupe: " + f.getEspaceOccupe());
		} catch (FormeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		


	}

}
