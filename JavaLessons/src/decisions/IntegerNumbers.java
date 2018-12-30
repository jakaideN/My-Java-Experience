package decisions;

import java.util.Scanner;

public class IntegerNumbers {

	public static void main(String args[]) {

		Scanner s = new Scanner(System.in);

		double numbers = 0;

		boolean condition = false;

		System.out.println("Enter the integer numbers: ");

		while (!condition) {

			numbers = s.nextDouble();

			if (numbers < 0) {
				System.out.println("the number is negative");
			} else if (numbers > 1000000) {
				System.out.println("the number is large");
			} else if (numbers == 0) {
				System.out.println("the number is zero");
			} else if (numbers < 1) {
				System.out.println("the number is small");
			} else if (numbers > 0) {
				System.out.println("the number is positive");
			}
			}

	}
}
