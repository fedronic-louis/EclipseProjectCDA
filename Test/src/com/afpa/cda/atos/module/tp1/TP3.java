package com.afpa.cda.atos.module.tp1;

import java.util.Scanner;
//import java.lang.Math; 
import java.util.Random; 



// Partie 2.a : créer un une classe objet puis à travers une boucle for, instancier le tout
class sommeCheque
{
	Random random = new Random(); 
	int somme= random.nextInt(500 - 50 + 1) + 50;
	
	class numeroCheque 
	{
		int numeroCheque=random.nextInt(1000);
	}
}
public class TP3 
{
// Partie 1 : on réalise un tableau à deux dimensions
	/*
	public static int numeroCheque()
	{
		Random random = new Random(); 
		int numeroCheque= random.nextInt(1000);
		//System.out.println("Le numéro de chèque est: "+numeroCheque+" et son montant : "+somme+ ".");
		return numeroCheque;
	}
	public static int sommeCheque()
	{
		Random random = new Random(); 
		int somme=random.nextInt(500 - 50 + 1) + 50; 
		
		return somme;
	}
	public static void main(String[] args) 
	{
		//Test
		System.out.println("Hello, World3");
		Scanner scan = new Scanner(System.in);
		System.out.println("Veuillez saisir le nombre de carnet de cheque ?");
		int serieCheque = scan.nextInt();
		int nombreCheque = serieCheque * 12; 
		int[][] tableauNC = new int [nombreCheque][2];
	
		for (int nbC = 0; nbC < nombreCheque; nbC++) 
		{
			tableauNC[nbC][0]= numeroCheque();
			tableauNC[nbC][1]= sommeCheque();
			System.out.println("Le numéro de chèque est: "+tableauNC[nbC][0]);
			System.out.println("Le numéro de somme est: "+tableauNC[nbC][1]);
		}
		
	}
	*/
	// Partie 2.b : créer un une classe objet puis à travers une boucle for, instancier le tout
	public static void main(String[] args) 
	{


		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Veuillez saisir le nombre de cheque ?");
		int nbCheque = scan.nextInt();
		int nbC = 0;

		for (nbC = 0; nbC < nbCheque; nbC++) 
		{
			sommeCheque mySomme = new sommeCheque();
			sommeCheque.numeroCheque myNCheque = mySomme.new numeroCheque();
			//System.out.println("Mon numero de cheque est "+myNCheque.numeroCheque +" et la somme du cheque est "+ mySomme.somme);
			System.out.println("************************************************************");
			if (mySomme.somme >200) 
			{
				System.out.println("Mon numero de cheque est "+myNCheque.numeroCheque +" et la somme du cheque est "+ mySomme.somme);
			}
			System.out.println("************************************************************");
			/*if(mySomme.somme <200 ) 
			{
				System.out.println("Mon numero de cheque est "+myNCheque.numeroCheque +" et la somme du cheque est "+ mySomme.somme);
			}*/
		}
		
		if (nbCheque ==0) 
		{
			System.out.println("aucun cheque possible");
		}
	}
}

