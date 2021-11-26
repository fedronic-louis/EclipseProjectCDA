package fr.eni.ecole.POO.groupeEleves.entite;

import java.util.Date;

public class Parent extends Personne implements Responsable{

	public Parent() {
		// TODO Auto-generated constructor stub
	}

	public Parent(String nom, String prenom, String adresse, Date ddn) {
		super(nom,prenom,adresse,ddn);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getNiveau() {
		// TODO Auto-generated method stub
		return "Responsable assistant";
	}
	
	//Nouvelle methode ajouter pour le TP9
	

}
