package decisions;

import java.util.Scanner;

public class Appointments {

	public static void main(String args[]) {

		int v = 0;

		int e = 0;

		Scanner s = new Scanner(System.in);

		System.out.println("Enter first appointment start time");

		int FirstStartTime = s.nextInt();

		System.out.println("Enter first appointment end time");

		int FirstEndTime = s.nextInt();

		System.out.println("Enter second appointment start time");

		int SecondStartTime = s.nextInt();

		System.out.println("Enter second appointment end time");

		int SecondEndTime = s.nextInt();

		if (FirstStartTime > SecondStartTime) {

			v = FirstStartTime;

		} else {

			v = SecondStartTime;
		}

		if (FirstEndTime < SecondEndTime) {

			e = FirstEndTime;

		} else {

			e = SecondEndTime;
		}
		
		if (v < e) {
			
			System.out.println("The appointments overlap");
		}else {
			
			System.out.println("The appointments don't overlap");

		}

	}
}