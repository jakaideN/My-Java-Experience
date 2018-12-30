package loops;

import java.util.Scanner;

public class P412 {

public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in);
		
		String word = in.nextLine();
		
	
		int k = 0;
		
		for(int i = 0; i <= word.length(); i ++) {
			// intial index
			for(int j = 0; j <= word.length()-i; j++) {
				//last index
				k = j + i;
				//replcement for substring
				for(int s = j; s < k; s++) {
					System.out.print(word.charAt(s));
				}
				System.out.println();

			}
			
		}
		

		
}
}