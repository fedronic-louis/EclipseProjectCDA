// TODO: Auto-generated Javadoc
/**
 * 
 */
/**
 * 
 */
package com.afpa.cda.atos.module.tp1;

/**
 * @author 31010-12-05
 *
 */
/**
 * @author 31010-12-05
 *
 */
public class TP5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * for(int line=0; line<=10; line++) { for(int colonne=0; colonne<=10;
		 * colonne++) { System.out.print("| _ "); } System.out.println(""); }
		 * System.out.println("A B C D E F G H I J");
		 * 
		 * 
		 */
		/*
		 * int line= 10; int colonne=10; int nbCase = line* colonne;
		 * System.out.println("Le nombre de case est "+nbCase); double riz=1;
		 * System.out.println("Le nombre pour la 1ere case est de "); for (int i = 0; i
		 * <=nbCase; i++) {
		 * 
		 * riz*=2; System.out.println(riz); }
		 */
		//Afficher riz par case 
		/*double tableau[][] = new double[10][10];
		double riz = 1;
		for (int line = 0; line < tableau.length; line++) 
		{
			for (int colonne = 0; colonne < tableau.length; colonne++) {
				tableau[line][colonne] = riz;

				// System.out.print("|"+riz+"|");
				riz *= 2;
			}
			//System.out.println("");
		}
		//////////////////////////
		for (int line = 0; line < tableau.length; line++) 
		{
			for (int colonne = 0; colonne < tableau.length; colonne++) {
				System.out.print("|" + tableau[line][colonne] + "|");
			}
		}
		
		*/
		
		affiche(remplirGrainsCarre(10));
	}
// J'alloue de la mémoire à mon tableau et le remplie case après case  à partir du nombre de ligne et de colonne

	/**
	 * @param dim
	 * @return
	 */
	public static double[][] remplirGrainsCarre(int dim) 
	{
		double tableau[][] = new double[dim][dim];
		double riz = 1;
		for (int line = 0; line < tableau.length; line++) 
		{
			for (int colonne = 0; colonne < tableau.length; colonne++) 
			{
				tableau[line][colonne] = riz;

				// System.out.print("|"+riz+"|");
				riz *= 2;
			}
		}
		return tableau;
	}
// J'affiche mon tableau case apres 	
	/**
	 * @param tabCarre
	 */
	static void affiche(double[][] tabCarre) 
	{
	
		for (int line = 0; line < tabCarre.length; line++) 
		{
			for (int colonne = 0; colonne < tabCarre.length; colonne++) 
			{
				System.out.print("|" + tabCarre[line][colonne] + "|");
				
			}
			System.out.println("");
		}
	}
}
			
	

	
