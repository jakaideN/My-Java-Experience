package lesson4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {

	//
	// //TASK 2 (1)

	boolean isWovel(char c) {
		boolean isWovel = false;

		switch (c) {

		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			isWovel = true;

		}
		return isWovel;
	}

//	String replaceWovels(String str) {
//
//	}

	public static void main(String args[]) {
		//
		Scanner scanner = new Scanner(System.in);
		//
		System.out.print("Please enter some string: ");

		String cumle = scanner.next();
		//
		//
		// System.out.print("Uppercase characters: ");
		// for(char c : cumle.toCharArray())
		// if(Character.isUpperCase(c))
		// System.out.print(c);
		// System.out.println("");
		//
		// //Task2 (2)
		//
		// if (cumle.length() < 2) {
		//
		// System.out.println("Cumle 2 herden ibaret deyil");
		//
		//
		// }else System.out.println("ikinci herf: " + cumle.charAt(1));
		//
		//
		// //TASK2 (3)
		//
		// String cumleVowels = cumle.replaceAll("[aeiou]", "\\_");
		// System.out.println("Without vowels: " + cumleVowels);

		//
		// //TASK2 (4)
		//
		// // System.out.println("Number of vowels: " + countOccurrencesRegex(cumle,
		// Pattern.compile("[aeiou]")));
		//
		//
		//
		// //TASK2 (5)
		//
		// System.out.println("Vowel positions:");
		// for(int i = 0; i < cumle.length(); i++) {
		//
		// if(cumle.charAt(i) != '_' && cumleVowels.charAt(i) == '_')
		// System.out.println(" - Vowel " + cumle.charAt(i) + " is at position " + (i +
		// 1));
		// }
		//
		//

		String tersineCumle = "";
		for (int i = cumle.length() - 1; i >= 0; i--) {
			System.out.println("tersine cumle: " + tersineCumle);
			tersineCumle = tersineCumle + cumle.charAt(i);

		}
		System.out.println(tersineCumle);

		// TASK 2.A
		// System.out.println("bir string daxil edin ");
		// String hello = scanner.nextLine();
		//
		// hello.trim();
		// System.out.println(hello);
		// int count = 0;
		//
		// for (int i = 0; i < hello.length(); i++) {
		//
		// if (count == 1) {
		//
		// System.out.println(hello.charAt(i) + " ");
		// }
		//
		// if (hello.charAt(i) == ' ') {
		//
		// count = 0;
		// } else {
		// count++;

		// }
		// }

	}
}
