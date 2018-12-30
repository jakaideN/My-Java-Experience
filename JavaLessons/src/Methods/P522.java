package Methods;

public class P522 {
	// Write a method that computes the balance of a bank account with a given initial balance and interest rate, after a given number of years. Assume interest is compounded yearly
	public static double computeBalance(double initialBalance, double interestRate, int year) {
		initialBalance = initialBalance + initialBalance * interestRate / 100 * year;
		return initialBalance;
	}
	
	public static void main (String args[]) {
		
		P522 object = new P522();
		
		//compute the balance of bank account with interest rate
		double balance = object.computeBalance(1000, 10, 3);
		System.out.println(balance);
	}

}
