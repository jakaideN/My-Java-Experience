package decisions;

import java.util.Scanner;

public class DollarAndCent {
	
	public static void main(String args[]) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter your money: ");
		
		double money = s.nextDouble();
		
		int  dolar = (int) money;
		
		double cent =  (((money - dolar) * 100) + 5);
		
//		double cent = (money - dolar) * 100;
		
		System.out.println("Dolar is: " + dolar);
		System.out.print("Cent is: " + cent);
		
		
	}

}
