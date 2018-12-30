package decisions;

import java.util.Scanner;

public class NumberLetterGrade {

	public static void main(String args[]) {

		Scanner s = new Scanner(System.in);

		double numericValueOfA = 4;
		double numericValueOfB = 3;
		double numericValueOfC = 2;
		double numericValueOfD = 1;
		double numericValueOfF = 0;

		System.out.println("Enter your degree");

		double number = s.nextDouble();


		if(number == 0) {
			System.out.println("F");
		}else if(number > 0.5 && number < 1) {
			System.out.println("D-");
		}else if (number == 1) {
			System.out.println("D");
		}else if(number > 1 && number < 1.5) {
			System.out.println("D+");
		}else if(number > 1.5 && number < 2.0) {
			System.out.println("C-");
		}else if(number == 2) {
			System.out.println("C");
		}else if(number >2.0 && number < 2.5) {
			System.out.println("C+");
		}else if(number > 2.5 && number < 3.0) {
			System.out.println("B-");
		}else if(number == 3.0) {
			System.out.println("B");
		}else if(number > 3.0 && number < 3.5) {
			System.out.println("B+");
		}else if(number > 3.5 && number < 4.0) {
			System.out.println("A-");
		}else if(number == 4.0) {
			System.out.println("A");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//		if(number > 4 ) {
//			System.out.println("A");
//		}else if (number < 4 && number > 3.85) {
//			System.out.println("B");
//		} else if (number < 3.85 && number > 3.00) {
//			System.out.println("B-");
//		} else if (number > 2.85 && number < 3.00) {
//			System.out.println("C");
//		} else if (number < 2.85 && number > 2.00) {
//			System.out.println("C-");
//		} else if (number < 2.00 && number > 1.85) {
//			System.out.println("B+");
//		}

	}
}