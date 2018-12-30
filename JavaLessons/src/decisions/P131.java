package decisions;

import java.util.Scanner;

public class P131 {
	
	public static void main(String args[]) {

		Scanner s = new Scanner(System.in);
		
		double paycheck = 0;

		System.out.println("Enter the name of the employee");
		
		String name = s.next();
		
		System.out.println("Enter the salary of the employee");
		
		double salary = s.nextDouble();
		
		System.out.println("Enter how many hours the employee worked in the past week");
		
		double hours = s.nextDouble();
		
		if(hours <= 40) {
			paycheck = salary * hours;
		}else if (hours > 40) {
			
			double time = hours - 40;
			paycheck = (salary * 40) + (salary * 1.5 * time);
		}
		
		System.out.println("name is " + name);
		
		System.out.println("paycheck is " + paycheck);
		
}
}
