package decisions;

import java.util.Scanner;

public class Bank {

	public static void main(String args[]) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter a initial balance");
		
		double initialBalance = s.nextDouble();
		
		System.out.println("Enter the interest rate");
		
		double interestRateAnnual = s.nextDouble();
		
		double monthlyInterestRate = interestRateAnnual / 12;
		
		double firstMonth =initialBalance + initialBalance  * monthlyInterestRate / 100 ;
		
		double secondMonth = firstMonth + firstMonth *  monthlyInterestRate / 100;
		
		double thirdMonth = secondMonth + secondMonth *  monthlyInterestRate / 100;
		
		System.out.println("Initial balance: " + initialBalance);
		
		System.out.println("Annual interest rate in percent: " + interestRateAnnual);
		
		System.out.println("After first month: " + firstMonth);
		
		System.out.println("After second month: " + (double)Math.round(secondMonth * 100)/100);
		
		System.out.println("After third month: " + (double)Math.round(thirdMonth * 100) / 100);
		
		
		
		
		
		
	}
}
