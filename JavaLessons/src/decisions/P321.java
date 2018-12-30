package decisions;

import java.util.Scanner;

public class P321 {
	
	public static void main(String args[]) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter income");
		
		double tax = 0;
		
		double income = s.nextDouble();
		
		if(income <= 50000) {
			tax = income * 1 / 100;
		}else if (income > 50000 && income <= 75000) {
			tax = income * 2 / 100;
		}else if (income > 75000 && income <= 100000) {
			tax = income * 3 / 100;
		}else if (income > 100000 && income <= 250000) {
			tax = income * 4 / 100;
		}else if (income > 250000 && income <= 500000) {
			tax = income * 5 / 100;
		}else if (income > 500000 ) {
			tax = income * 6 / 100;
		}
		System.out.println("Your income is: " + income);
		System.out.println("Your tax is: " + tax);
		
		
		
}
}