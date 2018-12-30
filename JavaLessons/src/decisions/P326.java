package decisions;

import java.util.Scanner;

public class P326 {

	public static void main(String args[]) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter Roman numbers");

		int numbers = s.nextInt();

		if (numbers / 1000 > 0) {

			for (int i = 0; i < numbers / 1000; i++) {
				System.out.print("M");
			}
			
			numbers = numbers - (numbers / 1000) * 1000; 
					
		}  if (numbers / 900 > 0) {

			for (int i = 0; i < numbers / 900; i++) {
				System.out.print("CM");
			}
			
			numbers = numbers - (numbers / 900) * 900; 
		}  if (numbers / 500 > 0) {

			for (int i = 0; i < numbers / 500; i++) {
				System.out.print("D");
			}
			
			numbers = numbers - (numbers / 500) * 500; 
		}  if (numbers / 400 > 0) {
			for (int i = 0; i < numbers / 400; i++) {
				System.out.print("CD");
			}
			
			numbers = numbers - (numbers / 400) * 400; 
		}  if (numbers / 100 > 0) {

			for (int i = 0; i < numbers / 100; i++) {
				System.out.print("C");
			}
			
			numbers = numbers - (numbers / 100) * 100; 
		}  if (numbers / 90 > 0) {
			for (int i = 0; i < numbers / 90; i++) {
				System.out.print("XC");
			}
			
			numbers = numbers - (numbers / 90) * 90; 
		}  if (numbers / 50 > 0) {
			for (int i = 0; i < numbers / 50; i++) {
				System.out.print("L");
			}
			numbers = numbers - (numbers / 50) * 50; 
		}  if (numbers / 40 > 0) {
			for (int i = 0; i < numbers / 40; i++) {
				System.out.print("XL");
			}
			
			numbers = numbers - (numbers / 40) * 40; 
		}  if (numbers / 10 > 0) {
			for (int i = 0; i < numbers / 10; i++) {
				System.out.print("X");
			}
			
			numbers = numbers - (numbers / 10) * 10; 
		}  if (numbers / 9 > 0) {
			for (int i = 0; i < numbers / 9; i++) {
				System.out.print("IX");
			}
			
			numbers = numbers - (numbers / 9) * 9; 
		}  if (numbers / 5 > 0) {
			for (int i = 0; i < numbers / 5; i++) {
				System.out.print("V");
			}
			
			numbers = numbers - (numbers / 5) * 5; 
		}  if (numbers / 4 > 0) {
			for (int i = 0; i < numbers / 4; i++) {
				System.out.print("IV");
			}
			
			numbers = numbers - (numbers / 4) * 4; 
		}  if (numbers / 1 >0) {
		
			for(int i = 0; i < numbers / 1; i++) {
			System.out.print("I");
			}
		}

	}
}
