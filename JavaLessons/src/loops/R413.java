package loops;

import java.util.Scanner;

public class R413 {

	public static void main(String args[]) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter scores of student");

		double avarage = 0;
		
		int counter = 0;

		boolean condition = false;
		
//		System.out.println("\tScore\t|Avarage");
//
//		System.out.println("\t-------------------");

		while (!condition) {

			String score = s.next();
//			System.out.println(score);
			
			double doubleScore = Double.parseDouble(score);
			
//			System.out.println(doubleScore);
			
			avarage = avarage + doubleScore/ (counter + 1);
			
			
			
			if (score.equalsIgnoreCase("-1")) {
				condition = true;
			}
			counter ++;
		}
		System.out.print(avarage);

		

	}
}
