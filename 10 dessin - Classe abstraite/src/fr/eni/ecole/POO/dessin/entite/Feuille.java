package fr.eni.ecole.POO.dessin.entite;

import java.util.ArrayList;
import java.util.List;

public class Feuille extends Rectangle {
	private List<Forme> lst = new ArrayList<Forme>();

	public Feuille(Double laMax, Double loMax) {
		super(laMax, loMax);
	}

	public void addForme(Forme forme) throws FormeException {
		if (forme.getAire() <= this.getEspaceLibre()) {
			lst.add(forme);
		} else {
			throw new FormeException("plus de place");
		}

	}

	public Double getEspaceLibre() {
		Double espaceLibre = this.getAire() - getEspaceOccupe();
		return espaceLibre;
	}

	public Double getEspaceOccupe() {
		Double espaceOccupe = new Double(0);
		for (Forme forme : lst) {
			espaceOccupe += forme.getAire();
		}
		return espaceOccupe;
	}

}
