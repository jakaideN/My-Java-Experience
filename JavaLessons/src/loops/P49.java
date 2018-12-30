package loops;

import java.util.Scanner;

public class P49 {
	
public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in);

		String word = in.nextLine();
		
		for(int i = word.length()-1; i >=0 ; i--) {
			
			System.out.print(word.substring(i , i +1 ));
			
			
		}


}
}
