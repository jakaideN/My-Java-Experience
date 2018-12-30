package loops;

import java.util.Scanner;

public class P47 {
	
public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in);

		String word = in.next();
			
			int i = (int) (Math.random() * word.length());

			int j =i + 1 + (int) (Math.random() *(word.length()- (i + 1)));
			
			System.out.println(i);
			
			System.out.println(j);
			
			String first = word.substring(0, i);
			
			String middle = word.substring(i+1, j);
			
			String last = word.substring(j+1, word.length());
			
			String finish = first + word.charAt(j) + middle + word.charAt(i) + last;
			
			System.out.println(finish);
			
			
			
			
		}
		
		
		
}
