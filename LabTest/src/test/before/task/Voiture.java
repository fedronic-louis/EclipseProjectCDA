package test.before.task;

public class Voiture {
	private String marque;
	private char lettre;

	public Voiture(String marque) {
		this.marque = marque;
		this.lettre = marque.charAt(0);
	}

	public String getMarque() {
		return marque;
	}

	public char getLettre() {
		return lettre;
	}
}
