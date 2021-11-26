package com.afpa.cda.atos.module.tp1;
import java.util.Scanner; // import the Scanner class



public class TP2 
{


	public static void main(String[] args) 
	{
		//Test
		System.out.println("Hello, World2");
		//Retour à la ligne
		//String newLine = System.getProperty("line.separator");
		
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Veuillez saisir le nom du salarié(e) ?");
		String nom = scan.next();
		System.out.println("Veuillez saisir le prénom du salarié(e) ?");
		String prenom  = scan.next();
		System.out.println("Veuillez saisir le statut du salarié(e) ?");
		String statut = scan.next();
		System.out.println("Veuillez saisir le nombre d'heure effectué par le salarié(e) ?");
		int nbHeure = scan.nextInt();
		System.out.println("Veuillez saisir le nombre d'enfant du salarié(e) ?");
		int nbEnfant = scan.nextInt();
		int ratio = nbHeure -169 ;
		float x =0;
		int prime=0;

		//float tauxHoraire=0;
		
		
		switch (statut) {
		  case "cadre":
			System.out.println("Le salarité est un "+statut+" et s'appel "+nom+" "+ prenom+".");
			float tauxHoraire= (float) 50.5; 
		    System.out.println("Il a effectué "+nbHeure +" heure dans le mois.");
		    
			if (ratio ==0)
				 
			{
				x= (float)0;
				System.out.println("Le taux d'heure supplémentaire à payer est " +x);
				//System.out.println("Son salaire de base est de" +salaireDeBase+ " euros");
				if(nbEnfant ==0) 
				{
					prime=0;
					System.out.println("Pas de prime.");
				}
				else if(nbEnfant ==1) 
				{
					prime =20;
					System.out.println("On ajoute une prime de " +prime+ " euros");
				}
				else if(nbEnfant ==2) 
				{
					prime =50;
					System.out.println("On ajoute une prime de " +prime+ " euros");
				}
				else 
				{
					prime = 70 + ((nbEnfant-2)*20);
					System.out.println("On ajoute une prime de " +prime+ " euros");
				}
			}
			else if (ratio >0 && ratio <12) 
			{
				x= (float) 1.5;
				System.out.println("Le taux d'heure supplémentaire à payer est " +x);
				//System.out.println("Son salaire de base est de" +salaireDeBase+ " euros");
				if(nbEnfant ==0) 
				{
					prime=0;
					System.out.println("Pas de prime.");
				}
				else if(nbEnfant ==1) 
				{
					prime =20;
					System.out.println("On ajoute une prime de " +prime+ " euros");
				}
				else if(nbEnfant ==2) 
				{
					prime =50;
					System.out.println("On ajoute une prime de " +prime+ " euros");
				}
				else 
				{
					prime = 70 + ((nbEnfant-2)*20);
					System.out.println("On ajoute une prime de " +prime+ " euros");
				}
			}
			else
			{
				x= (float)1.6;
				System.out.println("Le taux d'heure supplémentaire à payer est " +x);
				if(nbEnfant ==0) 
				{
					prime=0;
					System.out.println("Pas de prime.");
				}
				else if(nbEnfant ==1) 
				{
					prime =20;
					System.out.println("On ajoute une prime de " +prime+ " euros");
				}
				else if(nbEnfant ==2) 
				{
					prime =50;
					System.out.println("On ajoute une prime de " +prime+ " euros");
				}
				else 
				{
					prime = 70 + ((nbEnfant-2)*20);
					System.out.println("On ajoute une prime de " +prime+ " euros");
				}
				
			}
			float argentRatio= ratio * x;
			float salaireDeBase = (tauxHoraire* nbHeure) + argentRatio ;
			System.out.println("Son salaire de base est de" +salaireDeBase+ " euros");
			float sDBPrime = salaireDeBase + prime;
			System.out.println("En comptant la prime, le salaire brut final est de " +sDBPrime+ " euros");
			float cotisation = (float)(salaireDeBase*(3.49/100))+ (float)(salaireDeBase*(6.15/100))+ (float) (salaireDeBase*(0.95/100))+(float) (salaireDeBase*(8.44/100))+(float) (salaireDeBase*(3.05/100))+(float) (salaireDeBase*(3.81/100))+(float) (salaireDeBase*(1.02/100));
			float salaireNet = salaireDeBase - cotisation;
			System.out.println("La somme net perçu est de " +salaireNet+ " euros");
	}
	
	
	
	
	
	}
}