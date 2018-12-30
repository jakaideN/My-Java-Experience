package decisions;

import java.util.Scanner;

public class BookStore {

	public static void main(String args[]) {

		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter total book price: ");
		
		double totalBookPrice = s.nextDouble();

		System.out.print("Enter number of books that you bought: ");
		
		int numberOfBooks = s.nextInt();

		double tax = totalBookPrice * 7.5 / 100;
		
		double shippingCharge = 2 * numberOfBooks;
		
		double priceOfOrder = totalBookPrice + tax + shippingCharge;
		
		System.out.print("Order price is: " + priceOfOrder);

	}
}
