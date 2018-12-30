package decisions;

import java.util.Scanner;

public class P333 {

	public static void main(String args[]) {

		double salary = 0;
		
		Scanner s = new Scanner(System.in);

		System.out.println("Enter spend");
		
		double spend = s.nextDouble();
		
		System.out.println("Choose the satisfaction level: 1 = totally satisfied, 2 = satisfied, 3 = dissatisfied");

		int level = s.nextInt();
		
		if(level == 1) {
			salary = spend * 0.2;
		}else if(level == 2) {
			salary = spend * 0.15;
		}else {
			salary = spend * 0.1;
		}
	
		System.out.println("Satisfaction level is: " + level);
		
		salary = salary * 100;
		
		int dollar = (int) (salary / 100);
		
		int cent =(int) (salary % 100);
		
		System.out.println("Salary is : " + dollar + " dollar" + "\n" + cent + " cent");
	
	
	
	
	}
}