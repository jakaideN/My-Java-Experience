package decisions;

import java.util.Scanner;
//Repeat exercise P3.35
public class P336 {

	public static void main(String args[]) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter the Frequency");
		
		double frequency = s.nextDouble();
		
		if(frequency <3 * Math.pow(10, 9)) {
			System.out.println("Radio waves");
		}else if (frequency >= 3 * Math.pow(10, 9) && frequency < 3 * Math.pow(10, 11)) {
			System.out.println("Microwaves");
		}else if (frequency >= 3 * Math.pow(10, 11) && frequency < 4 * Math.pow(10, 14)) {
			System.out.println("Infrared");
		}else if (frequency >= 4 * Math.pow(10, 14) && frequency < 7.5 * Math.pow(10, 14)) {
			System.out.println("Vsible light");
		}else if (frequency >= 7.5 * Math.pow(10, 14) && frequency < 3 * Math.pow(10, 16)) {
			System.out.println("Ultraviolet");
		}else if (frequency >= 3 * Math.pow(10, 16) && frequency < 3 * Math.pow(10, 19)) {
			System.out.println("X-rays");
		}else if (frequency >= 3 * Math.pow(10, 19)) {
			System.out.println("Gamma rays");
		}
		
		
}
}