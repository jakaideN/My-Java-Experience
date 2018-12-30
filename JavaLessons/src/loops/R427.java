package loops;

import java.util.Scanner;

public class R427 {

	public static void main(String args[]) {

		Scanner s = new Scanner(System.in);

		int height = 4;
		
		int width = 5;
	
		for(int i = 1; i <= height * width; i++) {
			
			System.out.print("*");
			
			if(i % width == 0) {
				System.out.print("\n");
			}
			
		}
		
		
}
}
