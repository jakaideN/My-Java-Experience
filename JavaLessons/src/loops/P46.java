package loops;

import java.util.Scanner;

public class P46 {
	
public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in);

		boolean first = true;
		
		double minimum = 0;
		
		while(in.hasNextDouble()) {
			
		double anyNumber = in.nextDouble();
			
		if(first==true) {	
			minimum = anyNumber;
			first = false;
		}else if(anyNumber < minimum) {
			minimum = anyNumber;
			}
			
			
		}
		
		System.out.println(minimum);
}
}