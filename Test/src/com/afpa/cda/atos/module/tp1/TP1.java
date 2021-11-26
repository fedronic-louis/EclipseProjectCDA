package com.afpa.cda.atos.module.tp1;
import java.util.Scanner; // import the Scanner class
public class TP1 {
	
	
	public static void main(String[] args) 
	{
		
		// Prints "Hello, World" to the terminal window.
		System.out.println("Hello, World1");
		
		int i = 0*6;
		System.out.println(i);
		/*
		String s ="exemple";
		for (int i =0; i <10; i++) 
		{
			String u = s +i;
			System.out.println("test:"+u);
		}
		*/
		
		/*
		 * 1=boeuf
		 * 2= porc
		 * a="bleu
		 * b=a point
		 * c=bien cuit
		 * */
		/*
	    Scanner myCooking = new Scanner(System.in);
	    String cooking;
	    // Enter meatName and press Enter
	    System.out.println("Enter your meat"); 
	    cooking = myCooking.nextLine();   
	       
	    System.out.println("Your choice is " + cooking); 	    
	    Scanner myCooking = new Scanner(System.in);
	    String cooking;

		
		int Meat = 1;
	    switch (Meat) {
	      case 1:
	        System.out.println(" You choosed Beef");
	        

		    // Enter meatName and press Enter
		    System.out.println("Enter your meat"); 
		       
		    cooking = myCooking.nextLine();
		    
		    if (cooking == "Bleu") 
	        {
		    	System.out.println("Your choice is " + cooking);
	        };
	        break;
	      case 2:
	        System.out.println("Porc");

	        break;
	    } */
		/*
		Scanner scan = new Scanner(System.in);
		System.out.println("Veuillez saisir un entier ?");
		int premierEntier = scan.nextInt();
		System.out.println("Veuillez saisir un autre entier ?");
		int secondEntier = scan.nextInt();
		int somme = premierEntier + secondEntier;
		System.out.println("La somme des saisies est égal à : " + somme);
		*/
		
		// Séparateur de ligne
		String newLine = System.getProperty("line.separator");
		
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Veuillez saisir un entier pour la viande ?"+ newLine +"1 pour boeuf"+ newLine +"2 pour Porc");
		int meat = scan.nextInt();
		System.out.println("Veuillez choisir le poids de la viande en gramme ?");
		int poids  = scan.nextInt();
		System.out.println("Veuillez saisir un autre entier pour la cuisson ?"+ newLine +"1 pour cuisson Bleu"+ newLine +"2 pour cuisson à point"+ newLine +"3 pour cuisson bien cuit");
		int cook = scan.nextInt();
		
		switch (meat) {
		  case 1:
		    System.out.println("Vous avez choisi une pièce de Boeuf de "+poids+" g");

			switch (cook) {
			  case 1:
				  double sommeBoeufBleu = ((poids*0.02)*60); 
			    System.out.println("Cuisson bleu, ça prendra "+sommeBoeufBleu+" secondes");
			    break;
			  case 2:
				  double sommeBoeufPoint = ((poids*0.034)*60);
				    System.out.println("Cuisson à point, ça prendra " +sommeBoeufPoint+" secondes");
				break;
			  case 3:
				  double sommeBoeufCuit = ((poids*0.05)*60);
				  	System.out.println("Cuisson bien cuit, ça prendra "+sommeBoeufCuit+" secondes");
				break;
			}
		    break;
		  case 2:
		    System.out.println("Vous avez choisi une pièce de Porc de "+poids+" g");
			switch (cook) {
			  case 1:
				  double sommePorcBleu = ((poids*0.0375)*60);
			    System.out.println("Cuisson bleu, ça prendra "+sommePorcBleu+" secondes");
			    break;
			  case 2:
				  double sommePorcPoint = ((poids*0.0625)*60);
				    System.out.println("Cuisson à point, ça prendra "+sommePorcPoint+" secondes");
				break;
			  case 3:
				  double sommePorcCuit = ((poids*0.1)*60);
				  	System.out.println("Cuisson bien cuit, ça prendra "+sommePorcCuit+" secondes");
				break;
			}
		    break;
		}

	}
}
