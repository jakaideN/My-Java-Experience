package Tekrar1;

import java.util.Scanner;

public class Loop {

	public static void main (String args[]) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println();
		
		int row = 1;
		
		String star = "*";
		
		String space = " ";
		
		int lenghtOfRowAndColumb = s.nextInt(); // kvadratlarin olculerini daxil edirik
		
		for(row = 1; row <= lenghtOfRowAndColumb; row++) {
			for(int col = 1; col <= 2 * lenghtOfRowAndColumb ; col++) {
				if(row != 1 && row != lenghtOfRowAndColumb) {
				if(col == lenghtOfRowAndColumb + 1) {
					System.out.print(" ");
				}
				if(col > lenghtOfRowAndColumb + 1 && col < 2 * lenghtOfRowAndColumb) {
					System.out.print(space);
				}
				else {
				System.out.print(star);
				}
				}
				else{
					if(col == lenghtOfRowAndColumb + 1) {
						System.out.print(" ");
					}
					System.out.print(star);
				}
		}
			System.out.println();
		}
	}
}
