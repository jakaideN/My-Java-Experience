package Tekrar1;

import java.util.Scanner;

public class Rum {

	public static void main(String args[]) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println();
		
		String word = s.nextLine();
		
		for (int i = 1; i < word.length(); i++) {
			
		Cavid:	for (int j = 0; j < word.length(); j++) {
					if((j + i) > word.length()) {
						break Cavid;
					}
					
					System.out.println(word.substring(j, j + i));	
			}
		}
		
		System.out.println(word);
		
		
		
	}
	
}
