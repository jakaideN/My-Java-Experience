package loops;

import java.util.Scanner;

public class P418 {

public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in);

		int number = in.nextInt();
		
		boolean isPrime = true;
		
		//verilmis edede qeder olan edeleri tapir
		for(int i = 2; i <= number; i++) {
			isPrime = true;
			for(int j = 2; j < i; j++) {
				if(i % j ==0) {
					isPrime = false;
					break;
				}
			}
			
			if(isPrime) {
				System.out.println(i);
			}
		}
		
}
}
