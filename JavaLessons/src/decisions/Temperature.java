package decisions;

import java.util.Scanner;

public class Temperature {
	public static void main (String args[]) {

	Scanner s = new Scanner(System.in);

	System.out.println("Enter the humidity: " );
	
	double RH = s.nextDouble();
	
	System.out.println("Enter temperature ");
	
	double T = s.nextDouble();
	
	final double a = 17.27;
	
	final double b = 237.7;
	
	double f = (a * T / b * T) + Math.log(RH);
	
	double Td = b * f / a - f;
	
	System.out.println("The dew point value: " + Td);
			
	
	

}
}
