package test.before.task;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class File {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//		List<String> liste = new ArrayList<>();
		//		liste.add("Hello");
		//		liste.add("World");
		//
		//		Stream<String> stream = liste.stream();
		//	System.out.println(stream.collect(Collectors.joining(", ")));



		//		IntStream test = IntStream.iterate(10, n -> n - 1).limit(15);
		//	test.forEach(System.out::println);
		//	System.out.println( IntStream.iterate(10, n -> n - 1).limit(15).sum());


		// Stream Reduction
		long resultat = LongStream.range(0, 50).sum();
		System.out.println(resultat);

		OptionalDouble moyenne = LongStream.range(0, 50).average();
		if (moyenne.isPresent()) {
			System.out.println(moyenne.getAsDouble());

			//Stream Collecte
			List<String> liste = Arrays.asList("une chaine", "une autre chaine", "encore une chaine");
			List<String> autreListe = liste.stream().collect(Collectors.toList());
			System.out.println(autreListe);
			
			
			//Stream Collecte plus complex avec un "groupingBy" 
			List<Voiture> lste = Arrays.asList(new Voiture("citroen"),
					new Voiture("renault"),
					new Voiture("audi"),
					new Voiture("citroen"));

			Map<String, List<Voiture>> map = lste.stream().collect(Collectors.groupingBy(Voiture::getMarque));
			System.out.println("\n\n");
			System.out.println(map.get("citroen").size()); // 2
			System.out.println(map.get("renault").size()); // 1
			System.out.println(map.get("audi").size());    // 1
			
			// possibilité de convertir caractère en it mais seulement pour des char, pas de chance pour les String
			System.out.println("\n\n");
			lste.stream().mapToInt(Voiture::getLettre).forEach(System.out::println);
			
			System.out.println("\n\n");
			
			//Stream le filtrage
			IntStream.iterate(1, n -> n + 1)
	         .filter(n -> n % 7 != 0)
	         .filter(n -> n % 2 != 0)
	         .limit(50)
	         .forEach(System.out::println);
			
			// Stream : le parallelisme
			System.out.println("\n\n");
			
			IntStream.range(1, 101).parallel().forEach(System.out::println);
			
			
		}

	}

}

