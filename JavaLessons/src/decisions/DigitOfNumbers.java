package decisions;

import java.util.Scanner;

public class DigitOfNumbers {
	public static void main(String args[]) {

		Scanner s = new Scanner(System.in);

		Double numbers = 0.0;

		boolean condition = false;

		System.out.println("Enter numbers");

		while (!condition) {

			numbers = s.nextDouble();
			if (numbers < 0) {
				numbers = numbers * -1;
			}
			
			if (numbers >= 100) {
				System.out.println("number is >=100");
			}
			else if (numbers >= 10) {
				System.out.println("number is >=10");
			} 
		}

	}

}
