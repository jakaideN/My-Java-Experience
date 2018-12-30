package loops;

import java.util.Scanner;

public class P43 {

	public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in);
		
		String secondLetter = "";
		
		String underScoreWord = "";
		
		int count = 0;
		
	while(in.hasNextLine()) {	 
		
		String anyString = in.nextLine();
		
		secondLetter = anyString.substring(1, 2);
		
		for(int i = 0; i <anyString.length(); i++) {
			
			if(Character.isUpperCase(anyString.charAt(i))) {
				System.out.print("Uppercase letters is : " + anyString.charAt(i) + "    ");
				}
			}
		
		System.out.println("\nSecond letter is : " + secondLetter);	
		
		for(int i = 0; i < anyString.length(); i++) {
			
			char vowel = anyString.charAt(i);
			
			if(anyString.charAt(i)=='a' ||
					anyString.charAt(i)=='e' ||
					anyString.charAt(i)=='i' ||
					anyString.charAt(i)=='o' ||
					anyString.charAt(i)=='u' ||
					anyString.charAt(i)=='A' ||
					anyString.charAt(i)=='E' ||
					anyString.charAt(i)=='I' ||
					anyString.charAt(i)=='O' ||
					anyString.charAt(i)=='U' ) {
				
		anyString = anyString.replace(vowel, '_');
		System.out.println("the position of " + vowel + " is : " + i + ", ");
		count++;
			}
		}
		System.out.println(anyString);
		System.out.println("Number of vowels is: " + count);
		
		
	}
	
	
		
		
}
}
