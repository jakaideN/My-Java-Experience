package loops;

import java.util.Scanner;

public class P45 {
	
public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in);
		
		double smallest = 0;
		
		boolean first = true;
		
		double avarage = 0;
		
		double previousNumber = 0;
		
		double sum = 0;
		
		double count = 1;
		
		double largest = 0;
		
		double range = 0;

		while(in.hasNextDouble()) {
			
			double anyNumber = in.nextDouble();
			
			count++;
			
			sum = sum + anyNumber;
			
			if(first==true) {	
				smallest = anyNumber;
				largest = anyNumber;
				first = false;
			}else {
				if(anyNumber < smallest) {
				smallest = anyNumber;
				}
				if(anyNumber > largest) {
					largest = anyNumber;
				}
			}
		
		}
		
		range = largest - smallest;
		
		avarage = sum / count;
		
		System.out.println("The avarage value is " + avarage);	

		System.out.println("The smallest number is " + smallest);
		
		System.out.println("The largest is " + largest);
		
		System.out.println("Range is " + range);
		
}
}
