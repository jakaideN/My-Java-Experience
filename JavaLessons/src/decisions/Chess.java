package decisions;

import java.util.Scanner;

public class Chess {

	public static void main(String args[]) {

		Scanner s = new Scanner(System.in);

		System.out.print("Add a position: ");

		String position = s.next();

		String color = null;

		if (position.substring(0, 1).equalsIgnoreCase("a") || position.substring(0, 1).equalsIgnoreCase("c")
				|| position.substring(0, 1).equalsIgnoreCase("e") || position.substring(0, 1).equalsIgnoreCase("g")) {

			if (Integer.parseInt(position.substring(1, 2)) % 2 == 0) {

				color = "White";

			} else {

				color = "Black";
			}

			

		} else {

			if (Integer.parseInt(position.substring(1, 2)) % 2 == 0) {

				color = "Black";
			} else {

				color = "White";
			}
		}

		System.out.println(color);
	
	}
}