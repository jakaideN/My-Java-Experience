package loops;

import java.util.Scanner;

public class P423 {

	public static void main(String[] args) {
	
	Scanner in = new Scanner(System.in);
	
	int number = 0;
	
	boolean condition = true;
	
	int x = 0;
	
	int y = 0;
	
	System.out.println("write the number of steps");
	
	System.out.println("1 is up "
			+ "4 is down"
			+ "2 is left"
			+ "3 is right");
	
	int steps = in.nextInt();
	
	for (int i = 0; i <= steps; i++) {
		
		number = (int) (Math.random() * 4) + 1;
		
		System.out.println(number);
			
			if(number == 1) {
				y++;
			}
			if(number==4) {
				y = y-1;
			}
			if(number==2) {
				x= x-1;
			}
			if(number==3) {
				x++;
			}
			System.out.println("(" + x + "," + " " + y + ")");
	}
	
	System.out.println("(" + x + "," + " " + y + ")");
	
	
	}
}
