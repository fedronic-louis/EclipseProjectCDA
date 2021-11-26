package fr.eni.ecole.POO.groupeEleves.entite;

import java.util.ArrayList;
import java.util.List;

public class Manege <T extends Personne> {
	protected String nom;
	private List<T> lstParticipant = new ArrayList<T>();

	public Manege() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Manege(String nom) {
		super();
		this.nom=nom;
		// TODO Auto-generated constructor stub
	}
	
	public void addParticipant (T t) {

        this.lstParticipant.add(t);
    }
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	
	public List<T> getLstParticipant() {
		return lstParticipant;
	}
	public void setLstParticipant(List<T> lstParticipant) {
		this.lstParticipant = lstParticipant;
	}
	@Override
	public String toString() {
		return "Manege [nom = " + nom + ", lstParticipant=" + lstParticipant + "]";
	}
	
}
