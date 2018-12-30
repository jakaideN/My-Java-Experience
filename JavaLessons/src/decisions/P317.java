package decisions;

import java.util.Scanner;

public class P317 {

	public static void main(String args[]) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter time 1");

		String time1 = s.next();
		
		System.out.println("Enter time 2");
		
		String time2 = s.next();
		
		String saat1 = time1.substring(0, 2);
		
		String saat2 = time2.substring(0, 2);
		
		String deqiqe1 = time1.substring(2);
		
		String deqiqe2 = time2.substring(2);
		
		int hour1 = Integer.parseInt(saat1);
		
		int hour2 = Integer.parseInt(saat2);
		
		int minute1 = Integer.parseInt(deqiqe1);
		
		int minute2 = Integer.parseInt(deqiqe2);
		
//		System.out.println("Enter hour 1:");
//
//		int hour1 = s.nextInt();
//
//		System.out.println("Enter hour 2");
//
//		int hour2 = s.nextInt();
//
//		System.out.println("Enter minute 1");
//
//		int minute1 = s.nextInt();
//
//		System.out.println("Enter minute 2");
//
//		int minute2 = s.nextInt();

		if (hour1 > hour2) {
			System.out.println(time1 + "comes first");
		} else if (hour1 == hour2) {
			if (minute1 < minute2) {
				System.out.println(time1 + "comes first");
			} else if (minute1 == minute2) {
				System.out.println(time1  + " and "  + time2  + " are the same");
			} else {
				System.out.println(time2 + "comes first");
			}
		} else {
			System.out.println( time2 + "comes first");
		}

	}
}
