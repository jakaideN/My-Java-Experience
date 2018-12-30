package decisions;

import java.util.Scanner;

public class P318 {

	public static void main(String args[]) {

		Scanner s = new Scanner(System.in);
		
		String season = null;

		System.out.println("Enter a month");
		
		int month = s.nextInt();
		
		System.out.println("Enter day");
		
		int day = s.nextInt();
		
		if(month == 1 || month == 2 || month == 3) {
			season = "Winter";
//			System.out.println(season);
		}else if (month == 4 || month == 5 || month == 6) {
			season = "Spring";
//			System.out.println(season);
		}else if(month == 7 || month == 8 || month == 9) {
			season ="Summer";
//			System.out.println(season);
		}else if (month == 10 || month ==11 || month == 12) {
			season = "Fall";
//			System.out.println(season);
		}
		if(month % 3 == 0 && day >=21) {
			if(season.equalsIgnoreCase("Winter")) {
				season = "Spring";
			}else if (season.equalsIgnoreCase("Spring")) {
				season = "Summer";
			}else if (season.equalsIgnoreCase("Summer")) {
				season = "Fall";
			}else {
				season = "Winter";
			}
		}
		
		System.out.println(season);
		
	}
}
