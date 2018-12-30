package loops;

import java.util.Scanner;

public class P414 {
	
public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in);

		int number = in.nextInt();
		
		int remainder = 0;
		
		while(number != 0) {
			
			remainder = number % 2;
			
			number = number / 2;
			
			System.out.println(remainder);
			
		}
		
		
		
}
}
