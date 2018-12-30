package decisions;

import java.util.Scanner;

public class ThreeNumber {

	public static void main(String args[]) {
		
		Scanner s = new Scanner(System.in);

		System.out.println("Enter three number");

		double number1 = s.nextDouble();
		
		double number2 = s.nextDouble();
		
		double number3 = s.nextDouble();
		
		if(number1 == number2 && number1 == number3 && number2 == number3 ) {
		
			System.out.println("All the number is the same");
			
		}
		
		else if(number1 != number2 && number1 != number3 && number2 != number3 ) {
			
			System.out.println("All the number is the different");
			
		}else {
			System.out.println("neither");
		}
		
		
		
		
		
	}
}
