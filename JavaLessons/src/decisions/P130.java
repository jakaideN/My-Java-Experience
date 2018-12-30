package decisions;

import java.util.Scanner;

public class P130 {

	public static void main(String args[]) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter checking initial balance");

		double checkingBalance = s.nextDouble();

		if (checkingBalance < 0) {
			System.exit(0);
		}

		System.out.println("Enter saving initial balance");

		double savingBalance = s.nextDouble();

		if (savingBalance < 0) {
			System.exit(0);
		}

		System.out.println("Choose the transactions: deposit, widthdrawal , transfer");

		String answer = s.next();

		System.out.println("Choose the account: checking , saving");

		String answerAccount = s.next();

		if (answerAccount.equalsIgnoreCase("checking")) {

			System.out.println("Enter the amount of money");

			double amount = s.nextDouble();

			if (amount > checkingBalance) {
				System.exit(0);
			}

			if(answer.equalsIgnoreCase("deposit")) {
				checkingBalance = checkingBalance + amount;
			}
			if(answer.equalsIgnoreCase("withdrawal")) {
				checkingBalance = checkingBalance - amount;
			}
			if(answer.equalsIgnoreCase("transfer")) {
				checkingBalance = checkingBalance - amount;
				savingBalance = savingBalance + amount;
			}
			
		} else {

			System.out.println("Enter the amount of money");

			double amount = s.nextDouble();

			if (amount > savingBalance) {
				System.exit(0);
			}

			if(answer.equalsIgnoreCase("deposit")) {
				savingBalance = savingBalance + amount;
			}
			if(answer.equalsIgnoreCase("withdrawal")) {
				savingBalance = savingBalance - amount;
			}
			if(answer.equalsIgnoreCase("transfer")) {
				savingBalance = savingBalance - amount;
				checkingBalance = checkingBalance + amount;
			}
			
			}
	
		System.out.println(checkingBalance);
		
		System.out.println(savingBalance);
	
	
	
	}
}
