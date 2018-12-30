package decisions;

import java.util.Scanner;

public class Termistor {

public static void main(String args[]) {
		
		Scanner s = new Scanner(System.in);

		System.out.print("Enter  resistance: ");
		
		double R = s.nextDouble();
		
		final double R0 = 1075;
		
		final double T0 = 85;
		
		final double BETTA = 3969;
		
		double T = (BETTA * T0 / T0 * Math.log(R/R0) + BETTA) - 273;
		
		System.out.println("Temperature is equal to: " + T);
		
		
		
		
		
		
	
}
}