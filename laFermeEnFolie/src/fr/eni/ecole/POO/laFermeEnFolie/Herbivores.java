package fr.eni.ecole.POO.laFermeEnFolie;



public class Herbivores extends Animaux {
	private String eatCorn;
	private int cornAvailable;
	
	
	public String getEatCorn() {
		return eatCorn;
	}
	public void setEatCorn(String eatCorn) {
		this.eatCorn = eatCorn;
	}
	public int getCornAvailable() {
		return cornAvailable;
	}
	public void setCornAvailable(int cornAvailable) {
		this.cornAvailable = cornAvailable;
	}
}
