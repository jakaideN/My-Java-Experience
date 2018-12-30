package decisions;

import java.util.Scanner;

public class P334 {

	public static void main(String args[]) {

		double coupon = 0;
		
		Scanner s = new Scanner(System.in);

		System.out.println("Enter your purchase");
		
		double purchase = s.nextDouble();
		
		if(purchase <= 10) {
			System.out.println("YOu have no coupon");
		}else if(purchase > 10 && purchase <= 60) {
			coupon = purchase * 0.8;
		}else if(purchase > 60 && purchase <= 150) {
			coupon = purchase * 0.10;
		}else if(purchase > 150 && purchase <= 210) {
			coupon = purchase * 0.12;
		}else if(purchase > 210) {
			coupon = purchase * 0.14;
		}
		
		System.out.println("Discount coupon is: " + coupon);
		
}
}
