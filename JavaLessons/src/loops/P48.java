package loops;

import java.util.Scanner;

public class P48 {
	
public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in);

		String word = in.nextLine();
		
		for(int i = 0; i < word.length(); i ++) {
			
			System.out.println(word.substring(i, i + 1));
			
			
		}
		
		
		
		
}
}
