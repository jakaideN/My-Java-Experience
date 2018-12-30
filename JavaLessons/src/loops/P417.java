package loops;

import java.util.Scanner;

public class P417 {

public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in);

		int number = in.nextInt();
		
		int bolen = 2;
		
		while(number != 1) {
		
		if(number % bolen ==0) {
			
			System.out.println(bolen);
			
			number = number / bolen;
			
			}else {
				bolen++;
			}
		}
		
		
}
}