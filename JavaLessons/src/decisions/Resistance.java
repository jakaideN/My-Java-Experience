package decisions;
import java.util.Scanner;
public class Resistance {

	public static void main (String args[]) {
	
	Scanner s = new Scanner(System.in);

	System.out.println("Enter three resistance of three resistors:");
	
	double first = s.nextDouble();
	
	double second = s.nextDouble();
	
	double third = s.nextDouble();
	
	double total ;
	
	double rTotal =  2 * second * third / (second + third);
	
	total = rTotal + first;
	
	System.out.println("The total resistance is: " + total);
	
	
	
	
	
	
	

	
}
}