package fr.eni.ecole.POO.dessin.demo;

import fr.eni.ecole.POO.dessin.entite.Carre;
import fr.eni.ecole.POO.dessin.entite.Dessin;
import fr.eni.ecole.POO.dessin.entite.Dessinable;
import fr.eni.ecole.POO.dessin.entite.Personne;
import fr.eni.ecole.POO.dessin.entite.Rectangle;

public class Demonstration {
	
	public static void main(String[] args) {
		Dessin<Dessinable> dessin = new Dessin<Dessinable>("dessin de Dessinable");
		dessin.addElement(new Carre(5.4));
		dessin.addElement(new Rectangle(5.4,7.0));
		dessin.addElement(new Personne());
		
		dessin.dessiner();
		
		Dessin<Personne> dessin2 = new Dessin<Personne>("Dessin de personnes");
		dessin2.addElement(new Personne());
		dessin2.addElement(new Personne());
		
		dessin2.dessiner();
	}

}
