package decisions;

import java.util.Scanner;

public class OrderNumber {

	public static void main(String args[]) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter three number");

		double number1 = s.nextDouble();

		double number2 = s.nextDouble();

		double number3 = s.nextDouble();

		if (number1 > number2 && number2 > number3) {

			System.out.println("in order");
		} else if (number1 > number2 && number2 >= number3) {

			System.out.println("in order");
		} else if (number1 < number2 && number2 < number3) {

			System.out.println("in order");
		} else if (number1 < number2 && number2 <= number3) {

			System.out.println("in order");
		} else if (number1 > number2 && number2 < number3) {
			System.out.println("not in order");
		} else if (number1 < number2 && number2 > number3) {
			System.out.println("not in order");
		}

	}
}