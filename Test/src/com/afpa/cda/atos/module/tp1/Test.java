package com.afpa.cda.atos.module.tp1;

public class Test {

	public static void main(String[] args) {
		char[][] alphabets = new char[26][26];

		// Initialisation alphabets
		for (int ligne = 0; ligne < 26; ligne++) {
			for (int col = 0; col < 26; col++) {
				int codeLettre = ((col + ligne) % 26) + 65;
				alphabets[ligne][col] = (char) codeLettre;
				//System.out.println("codeLettre " +codeLettre+ "  col "+col +" ligne " +ligne );
				//System.out.println(alphabets[ligne][col]);
				
			}
			
		}
		// Permet de crypter hello avec la clé inci 
		String phraseCrypt=cryptString(alphabets,"HELLO","INCI");
		
		System.out.println("result : " + phraseCrypt);

	}
	//la fonction qui défini le cryptage
	private static String cryptString(char[][] alphabets, String phraseInitiale, String cleCryptage) {
		String resultat = "";
		int indiceCle = 0;
		int valLettreCle = 0;
		int valLettrePhrase = 0;

		for (int indicePhrase = 0; indicePhrase < phraseInitiale.length(); indicePhrase++) {
			valLettreCle = ((int) cleCryptage.charAt(indiceCle)) - 65;
			valLettrePhrase = ((int) phraseInitiale.charAt(indicePhrase)) - 65;
			resultat += alphabets[valLettreCle][valLettrePhrase];

			if (++indiceCle == cleCryptage.length()) {
				indiceCle = 0;
			}
		}
		return resultat;
	}
	


}
