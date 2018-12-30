package decisions;

import java.util.Scanner;

public class P322 {

	public static void main(String args[]) {

		Scanner s = new Scanner(System.in);
		
		double tax = 0;

		System.out.println("Enter your status:");
		
		String  status = s.next();
		
		System.out.println("Enter your income");
		
		double income = s.nextDouble();
		
		if (status.equalsIgnoreCase("single")) {
			
			if(income < 8000 && income >0) {
				tax = income * 10 / 100;
			}else if(income > 8000 && income < 32000) {
				tax = income * 15 / 100 + 800;
			}else if(income > 32000) {
				tax = 4400 + income * 25 / 100;
			}	
		}else if (status.equalsIgnoreCase("married")) {
			
			if(income < 16000 && income >0) {
				tax = income * 10 / 100;
			}else if(income > 16000 && income < 64000) {
				tax = income * 15 / 100 + 1600;
			}else if(income > 64000) {
				tax = 8800 + income * 25 / 100;
			}	
			
		}
		
		System.out.println("Your tax is: " + tax);
		
		
		
}
}