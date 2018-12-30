package decisions;

import java.util.Scanner;

public class NumberIncreasing {

	public static void main(String args[]) {

		Scanner s = new Scanner(System.in);

		String answer = null;

		System.out.println("Enter three number");

		double number1 = s.nextDouble();

		double number2 = s.nextDouble();

		double number3 = s.nextDouble();

		System.out.println("Chose your mode");

		answer = s.next();

		if (answer.equalsIgnoreCase("Strict")) {
			if (number1 > number2 && number2 > number3) {

				System.out.println("Decreasing");

			} else if (number1 < number2 && number2 < number3) {

				System.out.println("Increasing");

			} else if (number1 == number2 && number2 == number3) {
				System.out.println("both increasing and decreasing");
			} else {
				System.out.println("neither");
			}

		}

		if (answer.equalsIgnoreCase("lenient")) {
			if (number1 > number2 && number2 >= number3) {

				System.out.println("Decreasing");

			} else if (number1 < number2 && number2 <= number3) {

				System.out.println("Increasing");

			} else if (number1 == number2 && number2 == number3) {
				System.out.println("both increasing and decreasing");
			}
		}

	}
}
