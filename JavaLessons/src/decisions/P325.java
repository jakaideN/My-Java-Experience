package decisions;

import java.util.Scanner;

public class P325 {

	public static void main(String args[]) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter one character from alphabet");

		boolean condition = false;

		while (!condition) {

			String character = s.next().toLowerCase();

			if (character.equalsIgnoreCase("exit")) {
				condition = true;
			}
			else {

			
				
				if (character.length() > 1) {
					System.out.println("You can only write one character from alphabet");
				}else {
					
					char firstChar = character.charAt(0);
					
					if(Character.isDigit(firstChar)) {
						
						System.out.println("You can't write digit");
						
					}else {
						
						if(firstChar == 'a' || firstChar == 'e' || firstChar == 'y' || firstChar == 'i' || firstChar == 'u' || firstChar == 'o')  {
		
							System.out.println("This is vovel sound");
		
						} else {
							System.out.println("This is consonant sound");
						}
						
					}
					
				}

//				

			}
		}
	}
}
