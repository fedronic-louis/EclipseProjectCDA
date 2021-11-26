//TODO : Auto-generated Javadoc
/**
 * The Class MyTest.
 */

package com.afpa.cda.atos.module.tp1;

public class TP6 
{
	/**
	 * Premier static : valeur max permet d'initier ma variable: très important de la placer ici pour la combinaison fonction chooseMax() & afficheMax()
	 */
	
	static int valeurMax=0;
	/**
	 * Deuxième static : valeur max permet d'initier ma variable: très important de la placer ici pour la combinaison fonction chooseMax() & afficheMax()
	 */
	static int whatIs=0; 

	public static void main(String[] args) 
	{
		System.out.println("Hello, World6");
		// TODO Auto-generated method stub
		/**
		 * Permet de modifier comme je veux i et j pour la fonction chooseMax(), notamment de lui coller ce que je veux sans perturber ma fonction 
		 */
		int i = 10;
		int j = 100;
		/**
		 * afficheMax(chooseMax(i,j)) permet d'utiliser ma fonction affiche pour afficher mon autre fonction qui montre le max
		 */
		afficheMax(chooseMax(i,j));
		
		/**
		 * Permet de modifier comme je veux x et y pour la fonction differenceORnot(), notamment de lui coller ce que je veux sans perturber ma fonction 
		 */		
		int x = 24;
		int y = 25;
		/**
		 * afficheDifference(differenceORnot(x, y)) permet d'utiliser ma fonction affiche pour afficher mon autre fonction qui montre s'il y a différence ou non
		 */
		afficheDifference(differenceORnot(x, y));
		
	}
	// C'est ici qu'est choisi la variable max
	static int chooseMax(int i, int j) 
	{

		
		if (i<j) 
		{
		
			valeurMax= j;
		}
		if (j<i) 
		{
			
			valeurMax = i;
		}
		return valeurMax;
	}
	// C'est ici qu'on affichera la valeur max de la variable i & j 
	static void afficheMax(int showMax) 
	{
		System.out.println("The max is "+showMax);
		
	}
	// C'est ici que se fera la difference entre X et Y
	static int differenceORnot(int x, int y) 
	{
		System.out.println("La valeur de Y est : "+y+" et celle de X : "+x);
		
		if(x==y) 
		{
			whatIs = 0;
		}
		if (y>x) 
		{		
			whatIs= 1;
		}
		if (y<x) 
		{
			
			whatIs = -1;
		}
		
		return whatIs;
	}
	//Cette fonction s'occupera d'afficher la différence entre Y et X
	static void afficheDifference(int diff) 
	{
		if (whatIs==0) 
		{
			System.out.println("X et Y sont égaux");
		}
		if(whatIs == 1) 
		{
			System.out.println("Y est plus grand que X");
		}
		if (whatIs == -1) 
		{
			System.out.println("X est plus grand que Y");
		}
	}
}
