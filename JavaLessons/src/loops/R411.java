package loops;

import java.util.Scanner;

public class R411 {
	public static void main(String args[]) {

		Scanner s = new Scanner(System.in);

		System.out.println("Su\tM\tT\tW\tTh\tF\tSa");
		for (int xana = 1; xana <= 34; xana++) {
			
			int reqem = xana - 3;
			
			System.out.print(reqem>0?reqem + "\t":" \t");
			

			if (xana % 7 == 0) {
				System.out.println();
			}
			
		}

	}
}