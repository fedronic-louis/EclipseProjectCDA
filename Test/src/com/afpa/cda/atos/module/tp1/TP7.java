package com.afpa.cda.atos.module.tp1;
//Importing utility classes
import java.util.*;
import java.util.Arrays;
import java.util.Random;


/*public class TP7 {

// Source:
// https://stackoverflow.com/questions/27254000/java-mix-up-letters

    public static void main(String[] args){
        String cards="Hello my Name is Jon, nice to meet you";
        System.out.println("Input String = " + cards);
        cards = shuffle(cards);
        System.out.println("Shuffled String = " + cards);
     }

    static String shuffle(String cards){
        if (cards.length()<=1)
            return cards;

        int split=cards.length()/2;

        String temp1=shuffle(cards.substring(0,split));
        String temp2=shuffle(cards.substring(split));

        if (Math.random() > 0.5) 
            return temp1 + temp2;
        else
            return temp2 + temp1;
    }
}*/





public class TP7 {

    public static void main(String[] args) {
        String result = "";
        
        //0 - Write sentence
        System.out.println("Ecrivez une phrase:");
        String phrase = Clavier.lireString();//"Hello world";
        
        //1 - Split String into words
        String [] words = phrase.split(" ");
//        System.out.println("1- " + Arrays.toString(words));
                
        //2 - Split words into chars
        for (int i=0; i < words.length; i++)
        {
            String[] characters = words[i].split("");
//            System.out.println("2- " + Arrays.toString(characters));
            
            //3 - Exclude first and last character
            for (int j=1; j < characters.length-1; j++)
            {
                //4- Shuffle indexes except for first and last letters
                
                //4-a) Generate random number
                int rand = getRandomNumberInRange(j, characters.length-2);
//                System.out.println("4-a) " + rand);

                //4-b) Assign random number to index
                String temp = characters[j];
                characters[j] = characters[rand];
                characters[rand] = temp;

            }
            //5- Tables back to Spring
            result = result.concat(" ").concat(String.join(" ", characters.toString()));
            
        }
        
        System.out.println(result);

    }
    
    // Generates random number in a defined range
    private static int getRandomNumberInRange (int min, int max) {
        Random random = new Random();
        return random.nextInt((max- min) + 1) + min;
    }

}