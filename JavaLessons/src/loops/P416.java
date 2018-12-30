package loops;

import java.util.Scanner;

public class P416 {

public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in);

		int fold1 = 1;
		
		int fold2 = 1;
		
		int fnew = 0;
		
		int number = in.nextInt();
		
		for(int i = 2; i < number; i++) {
			
			fnew =  fold1 + fold2;
			
			fold1 = fold2;
			
			fold2 = fnew;
			
		}
		
		System.out.println(fold2);
		
}
}
