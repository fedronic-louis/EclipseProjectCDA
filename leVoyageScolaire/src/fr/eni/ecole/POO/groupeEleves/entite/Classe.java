package fr.eni.ecole.POO.groupeEleves.entite;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;




public class Classe {
	private String nom;
	private Instituteur instituteur ;
	private List<Eleve> lstEleves = new ArrayList<Eleve>() ;
	private List<Parent> listParent = new ArrayList<Parent>();
	
	public Classe() { //constructeur
		// TODO Auto-generated constructor stub
	}
	public Classe(String nom) { //constructeur
		this.setNom(nom);
		// TODO Auto-generated constructor stub
	}
	
	public Eleve getEleve (Integer i) throws ClasseException {

        try {
        	return lstEleves.get(i);
        } 
        catch (Exception ex)
        {
        		throw new ClasseException("La classe ne contient que "+ lstEleves.size()+" élèves.");
        } 
    }
	
	public void addEleve (Eleve e) {

        this.lstEleves.add(e);
    }

    public void removeEleve (Eleve e) throws ClasseException {

        try {
        	this.lstEleves.remove(e);
        } 
        catch (Exception ex)
        {
        		throw new ClasseException("Something went wrong.");
        } 
        
    }
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Instituteur getInstituteur() {
		return instituteur;
	}
	public void setInstituteur(Instituteur instituteur) {
		this.instituteur = instituteur;
	}

	public List<Eleve> getLstEleves() {
		return lstEleves;
	}
	public List<Parent>getListParent(){
		for (Eleve eleve : lstEleves){// ceci est un for each : https://www.geeksforgeeks.org/for-each-loop-in-java/
		listParent.add(eleve.getReferent());
		}
			return listParent;
	}

	public void setLstEleves(List<Eleve> lstEleves) {
		this.lstEleves = lstEleves;
	}

	
	

	public void sortListEleve() {
		// TODO Auto-generated method stub
		Collections.sort(lstEleves);
		
	}




	@Override
	public String toString() {
		return "Le nom de l'instituteur est "+ instituteur.getNom() +" "+instituteur.getPrenom()+"\n"+ instituteur + lstEleves +"\n"+ listParent + " \n ";
	}
	
}
