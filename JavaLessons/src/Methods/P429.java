package Methods;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class P429 {

	public static double reachablePeople(int degree, double averageFriendsPerUser) {
		if(degree == 1) {
			return averageFriendsPerUser;
		}
		return reachablePeople(degree - 1, averageFriendsPerUser) + averageFriendsPerUser;
	}
	
	public static void main (String args[]) {
//		char c = '\u2549';
//		System.out.println(c);
		
//		String[] strs = new String[] {"Cavid", "Leleyev"};
//		
//		System.out.println(strs.toString());
//		
//		System.out.println(java.util.Arrays.toString(strs);
//		
//		strs.setStringArray(new String[]{"Hello"});
		
		LocalDate date = LocalDate.now();
		
//		System.out.println(date.format(DateTimeFormatter.ISO_LOCAL_DATE));
		
		LocalTime time = LocalTime.now();
		
//		System.out.println(time);
		
//		LocalDateTime dt = LocalDateTime.parse("Cavid", formatter);	
		
//		System.out.println(dt);
		
		
//		System.out.println(dt);
		
		DateTimeFormatter shortDate = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		
		
//		System.out.println(dt.format(shortDate));
		
		
		
		
	}
	
}
