package fr.eni.ecole.POO.dessin.entite;

import java.util.ArrayList;
import java.util.List;

public class Dessin<T extends Dessinable> {
	private String nom;
	private List<T> lst = new ArrayList<T>();
	
	public Dessin() {
	}

	public Dessin(String nom) {
		super();
		this.nom = nom;
	}
	
	public void addElement(T f) {
		lst.add(f);
	}
	
	public void dessiner() {
		for (T dessinable : lst) {
			dessinable.dessiner();
			System.out.println();
		}
	}
	
	// ACCESSEURS
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<T> getLst() {
		return lst;
	}

	public void setLst(List<T> lst) {
		this.lst = lst;
	}
	
	
	
	
	
}
