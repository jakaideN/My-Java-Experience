package loops;

import java.util.Scanner;

public class P411 {
	
public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in);

		String word = in.nextLine();
		
		int count = 0;
		
		for(int i = 0; i < word.length(); i++) {
					
					char vowel = word.charAt(i);
					
					if(word.charAt(i)=='a' ||
					word.charAt(i)=='e' ||
					word.charAt(i)=='i' ||
					word.charAt(i)=='o' ||
					word.charAt(i)=='u' ||
					word.charAt(i)=='A' ||
					word.charAt(i)=='E' ||
					word.charAt(i)=='I' ||
					word.charAt(i)=='O' ||
				    	word.charAt(i)=='U' ) {
						
						count ++;	
					}
			}	
		
		System.out.println("Hecalarin sayi " + count);
		
		
}
}