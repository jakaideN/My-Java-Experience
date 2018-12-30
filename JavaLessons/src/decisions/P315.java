package decisions;

import java.util.Scanner;

public class P315 {
	
	public static void main(String args[]) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter three numbers");
		
		double n1 = s.nextDouble();
		
		double n2 = s.nextDouble();
		
		double n3 = s.nextDouble();
		
		if( n1 > n2 && n1 > n3) {
			System.out.print("The largest: " + n1);
		}else if ( n2 > n1 && n2 > n3) {
			System.out.print("The largest: " + n2);
		}else if ( n3 > n1 && n3 > n2) {
			System.out.print("The largest: " + n3);
		}
		
		
		
		
}
}