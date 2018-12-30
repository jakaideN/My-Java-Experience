package loops;

import java.util.Scanner;

public class P436 {
		
	private static double h = 6;
	
	private static double t = 0;
	
	public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in);
		
		
		for(int i = 0; i <= 86400; i++) {
		
		double relativeAmount =  Math.pow(Math.E, -i * (Math.log(2/h) ) );
		
		if(i % 3600 == 0) {
		System.out.println(relativeAmount);
		}
		}
	}
	
	
}
