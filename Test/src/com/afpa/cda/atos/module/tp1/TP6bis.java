
package com.afpa.cda.atos.module.tp1;

public class TP6bis {
    public static void main(String[] args){
        System.out.println("Veuillez rentrer le premier nombre que vous souhaitez comparer : ");
        double premierArg = Clavier.lireInt();

        System.out.println("Veuillez rentrer le second nombre que vous souhaitez comparer : ");
        double secondArg = Clavier.lireInt();

        comparaisonParametres(premierArg, secondArg);
        trouveMaxParametres(premierArg, secondArg);
    }

    public static void trouveMaxParametres(double x, double y){
        if(x < y){
            System.out.println("Le paramètre le plus grand est : " + y);
        } else if(x > y){
            System.out.println("Le paramètre le plus grand est : " + x);
        } else {
            System.out.println("Les paramètres sont de même valeurs.");
        }
    }

    public static int comparaisonParametres(double x, double y){
        if(x == y){
            System.out.println("0");
            return 0;
        } else if(x > y){
            System.out.println("1");
            return 1;
        } else {
            System.out.println("-1");
            return -1;
        }
    }
}