package decisions;

import java.util.Scanner;

public class P332 {

	public static void main(String args[]) {

		Scanner s = new Scanner(System.in);

		String realPin = "1234";

		System.out.println("Enter the pin");

		String pin = s.next();

		if (pin.equalsIgnoreCase(realPin)) {
			System.out.println("Your pin is correct");
		} else if (!pin.equalsIgnoreCase(realPin)) {
			System.out.println("Your pin is incorrect");

			System.out.println("\nEnter the pin");

			String pin1 = s.next();
			if (pin1.equalsIgnoreCase(realPin)) {
				System.out.println("Your pin is correct");
			} else {
				System.out.println("your pin is incorrect");
				
				System.out.println("\nEnter the pin");

				String pin2 = s.next();
				if (pin2.equalsIgnoreCase(realPin)) {
					System.out.println("Your pin is correct");
				} else {
					System.out.println("Your bank card is blocked");
				}
			
			}
			

		}
	}
}
