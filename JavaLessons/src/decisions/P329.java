package decisions;

import java.util.Scanner;

public class P329 {
	

	public static void main(String args[]) {

		Scanner s = new Scanner(System.in);
	
		
		System.out.println("Enter year");
		
		int year = s.nextInt();
		
		boolean leapYear = year % 400 == 0;

		System.out.println(leapYear);
	}
	}
