package loops;

import java.util.Scanner;

public class P426 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		int hits = 0;
		
		int i = 0;
		
		for( i = 0; i <= 10000; i++) {
		
		int angle =(int) (Math.random() * 180);
		
		double startPoint =Math.random() * 3;
		
		double yHigh = startPoint + Math.sin(angle);
		
		if(yHigh >= 2) {
			hits++;
		}
		
		}
		
		double value = i /(double) hits;
		
		System.out.println(value);
}
}
