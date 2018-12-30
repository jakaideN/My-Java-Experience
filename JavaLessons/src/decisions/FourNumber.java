package decisions;

import java.util.Scanner;

public class FourNumber {

	public static void main(String args[]) {

		Scanner s = new Scanner(System.in);

		
		System.out.println("Enter four number");

		double number1 = s.nextDouble();
		
		double number2 = s.nextDouble();
		
		double number3 = s.nextDouble();
		
		double number4 = s.nextDouble();
		
		if(number1 == number2 && number2 == number3 && number3 == number4 ) {
			
			System.out.println("two pairs");
		}else if(number1 == number2 || number1 == number3 || number1 == number4 || number2 == number3 || number2 == number4 || number3 == number4) {
			
			System.out.println("two pairs");
		}else if(number1 != number2 || number1 != number3 || number1 != number4 || number2 != number3 || number2 != number4 || number3 != number4) {
			
			System.out.println("not two pairs");
		}
		
		
		
		
		
	}
}
