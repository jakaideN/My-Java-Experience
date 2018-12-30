package loops;
import java.util.Scanner;
public class P435 {
	
	private static double B = 0;
	
	private static double L = 0;
	
	private static double T = 0;
	
	private static double x = 0;
	
	private static double n = 0;
	
	private static double y = 0;
	
	private static double sum = 0;
	
	private static double z = 0;
		
	public static void main (String args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the B");
		
		B = in.nextDouble();
		
		System.out.println("Enter the L");

		L = in.nextDouble();
		
		System.out.println("Enter the T");

		T = in.nextDouble();
		
		System.out.println("Enter the x");

		x = in.nextDouble();
		
		System.out.println("Enter the n");

		n = in.nextDouble();

		for(int i = 0; i <= n; i++) {
			
			z = T / n;
			
			 y = B/2 * (1 - (2*x/L) * (2*x/L)) * (1 - (z/T) * (z/T));
			 
			 sum = sum + y;
			
		}
		
		
		
	}

}
