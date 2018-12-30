package decisions;

import java.util.Scanner;

public class P316 {

	public static void main(String args[]) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter three strings");

		String word1 = s.next();

		String word2 = s.next();

		String word3 = s.next();

		String first = null;

		String second = null;

		String third = null;

		char firstCharOfWord1 = word1.charAt(0);

		char firstCharOfWord2 = word2.charAt(0);

		char firstCharOfWord3 = word3.charAt(0);

		if (firstCharOfWord1 < firstCharOfWord2 && firstCharOfWord2 < firstCharOfWord3 &&firstCharOfWord1 < firstCharOfWord3) {
			first = word1;
			second = word2;
			third = word3;
		} else if (firstCharOfWord1 < firstCharOfWord2 && firstCharOfWord2 > firstCharOfWord3 && firstCharOfWord1 < firstCharOfWord3) {
			first = word1;
			second = word3;
			third = word2;
		} else if (firstCharOfWord1 < firstCharOfWord2 && firstCharOfWord2 > firstCharOfWord3 && firstCharOfWord1 > firstCharOfWord3 ) {
			first = word3;
			second = word1;
			third = word2;
		} else if (firstCharOfWord1 > firstCharOfWord2 && firstCharOfWord2 > firstCharOfWord3 && firstCharOfWord1 > firstCharOfWord3) {
			first = word3;
			second = word2;
			third = word1;
		}else if(firstCharOfWord1 > firstCharOfWord2 && firstCharOfWord2 < firstCharOfWord3 && firstCharOfWord1 > firstCharOfWord3) {
			first = word2;
			second = word3;
			third = word1;
		}else if (firstCharOfWord1 > firstCharOfWord2 && firstCharOfWord2 < firstCharOfWord3 && firstCharOfWord1 < firstCharOfWord3) {
			first = word2;
			second = word1;
			third = word3; 
		}
		
		String result = first + " " + second + " " + third;
		
		System.out.println(result);

	}
}