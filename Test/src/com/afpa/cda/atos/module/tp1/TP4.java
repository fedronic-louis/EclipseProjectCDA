package com.afpa.cda.atos.module.tp1;

import java.util.Scanner;

/**
 * @author 31010-12-05
 *
 */
public class TP4 {

   public static void main(String args[]){
	   //Definir nombre 1er sur une fourchette entre 1 et 1000
/*
      for(int i = 2; i<=1000;)
      {
         int premier = 1;
         for(int loop = 2; loop <=i; loop++) 
         {
            if((i % loop) == 0 && loop!=i)
            {
               premier = 0;
            }
         }
         if (premier != 0){
            System.out.println(i+" est un nombre premier");
            i++;
         }
         else
         i ++;
      }
*/
	   // Definir nombre premier à partir 
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Veuillez saisir un nombre entier ?");
		int nombre = scan.nextInt();
	      for(int i = 2; i<=nombre;)
	      {
	         int premier = 1;
	         for(int loop = 2; loop <=i; loop++) 
	         {
	            if((i % loop) == 0 && loop!=i)
	            {
	               premier = 0;
	            }
	         }
	         if (premier != 0){
	            System.out.println(i+" est un nombre premier");
	            i++;
	         }
	         else
	         i ++;
	      }
  }
}
