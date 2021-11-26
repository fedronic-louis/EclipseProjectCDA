package fr.eni.ecole.POO.groupeEleves.entite;

import java.util.ArrayList;
import java.util.List;

public class Bus {
	
	protected int nbPlaceMax;
	private List<Personne> lstPersonnes = new ArrayList<Personne>() ;
	


	public Bus() {
		// TODO Auto-generated constructor stub
	}
	
	public Bus(int nbPlaceMax) {
		// TODO Auto-generated constructor stub
		this.nbPlaceMax = nbPlaceMax;
	}
	public int getNbPlaceMax() {
		return nbPlaceMax;
	}

	public void setNbPlaceMax(int nbPlaceMax) {
		this.nbPlaceMax = nbPlaceMax;
	}

	
	
	public List<Personne> getLstPersonnes() {
		return lstPersonnes;
	}

	public void setLstPersonnes(List<Personne> lstPersonnes) {
		this.lstPersonnes = lstPersonnes;
	}
	
	public void addPersonne (Personne p) throws BusException {

        if (lstPersonnes.size() <nbPlaceMax) {
        	this.lstPersonnes.add(p);
        } 
        else
        {
        		throw new BusException("Le bus est plein " + p.getNom() +" " +p.getPrenom() +" ne peux pas partir");
        } 
		
    }
	public void afficherResponsables() {
		for (Personne p : lstPersonnes ) { // je fais une for each car je souhaite parcourir la liste personne à la recherche des responsables (parent et instituteur)
			if (p instanceof Responsable) { //Responsable est une instance dans ce cas précis
				System.out.println("Le responsable est : "+ p.getNom() + " " + p.getPrenom()+ " " + ((Responsable)p).getNiveau() );	// A revoir ! On cast l'instance Responsable pour Personne (p)  afin de retrouver la méthode getNiveau()
			}
			
	}}
}
