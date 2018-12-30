package decisions;

import java.util.Scanner;

public class P339 {

	public static void main(String args[]) {

		Scanner s = new Scanner(System.in);

		double realValue = 0;

		System.out.println("Enter sound unit");

		String unit = s.nextLine();

		System.out.println("Enter value");

		double value = s.nextDouble();

		if (unit.equalsIgnoreCase("dB")) {
			realValue = value;
		} else {System.out.println(value);
			realValue = 20 * Math.log10(value * Math.pow(10, 6) / 20 );
		}
		if (realValue < 15 && realValue >= 0) {
			System.out.println("Light leaf rustling");
		}
		if (realValue >= 15 && realValue < 45) {
			System.out.println("Calm library");
		}
		if (realValue >= 45 && realValue < 75) {
			System.out.println("Normal conversation");
		}
		if (realValue >= 75 && realValue < 95) {
			System.out.println("Traffic on a busy roadway at 10m");
		}
		if (realValue >= 95 && realValue < 110) {
			System.out.println("Jack hammer at 1m");
		}
		if (realValue >= 110 && realValue < 125) {
			System.out.println("Possible hearing damage");
		}
		if (realValue >= 130) {
			System.out.println("Treshold of pain");
		}

	}
}
