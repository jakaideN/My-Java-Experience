package Methods;

import java.util.Scanner;

public class P524 {
	
	
	
	
	
	public static void main(String args[]) {
	
	double salary = 0;	
		
	double salaryPerHour = 5.67;
		
	Scanner in = new Scanner(System.in);
	
	System.out.println("Enter the name of employee: ");
	
	String nameOfEmployee = in.nextLine();
	
	System.out.println("Enter the hourly rate of " + nameOfEmployee + ":");
	
	int hourlyRate = in.nextInt();
	
	if(hourlyRate > 40) {
		salary = salaryPerHour * hourlyRate * 1.5;
	}else {
		salary = salaryPerHour * hourlyRate;
	}
	
	System.out.println("Name:\t\t\t"  + nameOfEmployee);
	System.out.println("Hourly rate:\t\t" + hourlyRate);
	System.out.println("Salary of " + nameOfEmployee + ":\t" + salary + " dollar");
	
	
		
		
	}
	

}
