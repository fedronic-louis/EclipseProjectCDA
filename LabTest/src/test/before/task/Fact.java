package test.before.task;
//TODO : Auto-generated Javadoc


/**Cet import servira à l'exercice 1  ByteArrayInputStream
 * import java.io.ByteArrayInputStream;
  */
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;



/** 
 * Fonction factorielle itératif
 * https://waytolearnx.com/2020/03/calculer-la-factorielle-en-java.html
 */

/*public class Fact {
	public static void main(String args[]) {
		int i, f = 1;
		// le nombre dont on veut calculer la factorielle
		int nbr = 3;
		for (i = 1; i <= nbr; i++) {
			f = f * i;
		}
		System.out.println("Factorielle de " + nbr + " est: " + f);
	}
}*/

/** 
 * Fonction factorielle récursive
 * http://www.enseignement.polytechnique.fr/profs/informatique/Benjamin.Werner/TD-2/factorielle.html
 */

/*public class Fact {

    public static int factR (int n) {
        if (n==0) return 1;
        else return(n*factR(n-1));
    }

    public static void main (String[] args) {
        System.out.print(factR(6));
        System.out.print("\n" + "It's end ");
    }
}*/



/** 
 * Fonction factorielle itératif
 * http://www.enseignement.polytechnique.fr/profs/informatique/Benjamin.Werner/TD-2/factorielle.html
 */

public class Fact {

    public static int fact (int n) {
        int f = 1;
        for (int i=1; i<=n; i++)
        f=f*i;
        return(f);
    }

    public static void main (String[] args) {
        System.out.print(fact(6));
        System.out.print("\n");
    }
}