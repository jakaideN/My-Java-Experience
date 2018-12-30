package loops;

import java.util.Scanner;

public class R412 {

	public static void main(String args[]) {

		Scanner s = new Scanner(System.in);

		System.out.println("\tCelsius\t|Fahenheit");

		System.out.println("\t-------------------");

		for (int c = 0; c <= 100; c = c + 10) {

			int f = (int) (c * 1.8 + 32);

			System.out.println("\t" + c + "\t" + "|" + "\t" + f);

			
		}

	}
}