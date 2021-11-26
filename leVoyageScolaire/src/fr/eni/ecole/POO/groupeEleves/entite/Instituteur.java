package fr.eni.ecole.POO.groupeEleves.entite;

import java.util.Date;

public class Instituteur extends Personne implements Responsable{

	public Instituteur() {
		// TODO Auto-generated constructor stub
	}
	public Instituteur(String nom, String prenom, String adresse, Date ddn) {
		
		super(nom,prenom,adresse,ddn);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String getNiveau() {
		// TODO Auto-generated method stub
		return "Responsable principal";
	}
	
	
	//Nouvelle methode ajouter pour le TP9
	


}
