package com.afpa.cda.atos.module.tp1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TP8bis {


        /**
         * @param args
         */
         
        static String str,reponse="";
        static char lettre ;
        static char alpha[] = {' ','a','b','c','d','e','é','è','f','g','h','i','s','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'}; 
        static char alphaCrypt[] = new char[30] ;
        static int n;
        static int decal;
         
        public static void main(String[] args) throws IOException {
                // TODO Auto-generated method stub
                Scanner sc = new Scanner(System.in);
                BufferedReader ligne = new BufferedReader(new InputStreamReader(System.in));
                 
                System.out.println("De combien voulez vous décaler");
                decal = sc.nextInt();
                System.out.println("Entre la phrase à coder");
                str = ligne.readLine();
                 
                for (int c=0; c < alpha.length; c++ )
                {
                         
                        if (c+decal < alpha.length)
                        {
                         
                                alphaCrypt[c] =alpha[c+decal];
                                
                        }
                        else 
                        {
                                int b = 0;
                                alphaCrypt[c] = alpha[b];
                                b++;
                                 
                        }
                }
                 
                for (int i = 0; i<str.length();i++){
                        lettre = str.charAt(i);  // lecture lettre par lettre
                         
                        for (int a=0; a < alpha.length; a++ ){
                                // position de la lettre dans le tableau "alpha"
                                if (alpha[a] == lettre) {
                                        n = a;
                                }
                                 
                        }
                        lettre = alphaCrypt[n];        
                        reponse = reponse+lettre;  
                 
                 
                }
                 
                System.out.println("Phrase codée :");
                System.out.println(reponse);
        }
 
}