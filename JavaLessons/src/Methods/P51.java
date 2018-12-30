package Methods;import javax.crypto.CipherOutputStream;
import javax.naming.spi.DirStateFactory.Result;

import org.omg.Messaging.SyncScopeHelper;

import java.util.Scanner;
public class P51 {
	
	public static String printAll(int x) {
		if(x == 0) {
			return x + "";
		}	
		return printAll(x-1) + ", " + x;
		
	}
	
	
	// find the smallest value
	public double smallest(double x, double y, double z) {
		double smallest = 0;
		if (x > y && z > y) {
			smallest = y;
		} else if (y > x && z > x) {
			smallest = x;
		} else if (x > z && y > z) {
			smallest = z;
		}
		return smallest;
	}

	// find the avarage value
	public double avarage(double x, double y, double z) {
		double avarage = (x + y + z) / 3;
		return avarage;
	}

	// check the elements if all the same
	public boolean allTheSame(double x, double y, double z) {
		if (x == y && y == z && x == z) {
			return true;
		}
		return false;
	}

	// check the elements if all the different
	public boolean allDifferent(double x, double y, double z) {
		if (x != y && y != z && x != z) {
			return true;
		}
		return false;
	}

	// returning true if the arguments are sorted, with the smallest one coming frst
	public boolean sorted(double x, double y, double z) {
		if (x < y && y < z && x < z) {
			return true;
		}
		return false;
	}

	// returning the frst digit of the argument
	public int firstDigit(int n) {
		String s = n + "";
		int firstDigit = Integer.parseInt(s.substring(0, 1));
		return firstDigit;
	}

	// returning the last digit of the argument
	public int lastDigit(int n) {
		String s = n + "";
		int lastDigit = Integer.parseInt(s.substring(s.length() - 1, s.length()));
		return lastDigit;
	}

	// returning the number of digits of the argument
	public int digits(int n) {
		String s = n + "";
		int numberOfDigits = s.length();
		return numberOfDigits;
	}

	// returns a string containing the middle character in str if the length of str
	// is odd,or the two middle characters if the length is even. For example,
	// middle("middle") returns "dd"
	public String middle(String s) {
		String middle = "";
		if (s.length() % 2 == 0) {
			middle = s.substring(s.length() / 2 - 1, s.length() / 2 + 1);
			return middle;
		} else {
			middle = s.substring(s.length() / 2, s.length() / 2 + 1);
			return middle;
		}
	}

	// that returns the string str repeated n times. For example, repeat("ho", 3)
	// returns "hohoho".
	public String repeat(String str, int n) {
		String result = "";
		for (int i = 0; i < n; i++) {
			result = result + str;
		}
		return result;
	}

	// that returns a count of all vowels in the string str. Vowels are the letters
	// a, e, i, o, and u, and their uppercase variants.
	public static int countVowels(String str) {
		int count = 0;
		for (int i = 0; i <= str.length() - 1; i++) {
			if (str.substring(i, i + 1).equalsIgnoreCase("a") || str.substring(i, i + 1).equalsIgnoreCase("E")
					|| str.substring(i, i + 1).equalsIgnoreCase("i") || str.substring(i, i + 1).equalsIgnoreCase("o")
					|| str.substring(i, i + 1).equalsIgnoreCase("u")) {
				count++;
			}
		}
		return count;
	}
	
	//returns a count of all words in the string str. Words are separated by spaces. For example, countWords("Mary had a little lamb") should return 5
	public static int countWords(String str) {
		int count = 1;
		for(int i = 0; i <=str.length()-1; i++) {
			if(str.charAt(i) == ' ') {
				count++;
			}
		}
		return count;
	}
	//that displays the prompt string, followed by a space, reads a foating-point number in, and returns it. Here is a typical usage salary = readDouble("Please enter your salary:");
	//percentageRaise = readDouble("What percentage raise would you like?");
	public static double readDouble(String prompt) {
		System.out.println(prompt);
		Scanner in = new Scanner(System.in);
		double number = in.nextDouble();
		return number;
	}
	//that returns the English name for a point in time, such as "ten minutes past two", "half past three", "a quarter to four", or "five o'clock". Assume that hours is between 1 and 12.
	public static String getTimeName(int hours, int minutes) {
		String result = "";
		if(minutes == 0) {
			 result = "It is " + hours + " o'clock";
		} if(minutes == 30) {
			result = "it is half past " + hours;
		} if (minutes <30) {
			result = minutes + " minutes past " + hours;
		} if (minutes > 30) {
			result = minutes + " minutes to " + hours;
		} if (minutes == 15) {
			result = "it is quarter past " + hours;
		} if(minutes == 45) {
			result = "it is quarter to " + hours;
		}
		return result;
	}
	//that computes the reverse of a string. For example, reverse("flow") should return
	//	"wolf". Hint: Reverse the substring starting at the second character, then add the frst
	//	character at the end. For example, to reverse "flow", frst reverse "low" to "wol", then
	//	add the "f" at the end
	public static String reverse(String str) {
		if(str.length() ==1 ) {
			return str;
		}
		String firstChar = str.substring(0, 1);
		return reverse(str.substring(1, str.length())) + firstChar; 
	}
	
	//that returns true if str is a palindrome, that is, a word that is the same when reversed. Examples of palindrome are “deed”, “rotor”, or “aibohphobia”. Hint: A word is a palindrome if the frst and last letters match and the remainder is also a palindrome.
	public static boolean isPalindrome(String str) {
		if(str.length() <=2) {
			return str.charAt(0) == str.charAt(str.length()-1);
		}
		if(str.charAt(0) == str.charAt(str.length()-1)) {
			return isPalindrome(str.substring(1, str.length()-1));
		}else {
			return false;
		}
		
	}
	// that tests whether match is contained in str:boolean b = find("Mississippi", "sip"); // Sets b to trueHint: If str starts with match, then you are done. If not, consider the string that youobtain by removing the frst character
	public static boolean find(String str, String match) {
		if(str.length() < match.length()){
			return match.equals(str.substring(0, match.length()));
		}
			if(match.equals(str.substring(0, match.length()))) {
			return true;
		}else {
			str = str.substring(1, str.length());
			return find(str, match);
		}
		
	}
	//Use recursion to determine the number of digits in an integer n. Hint: If n is < 10, it has one digit. Otherwise, it has one more digit than n / 10
	public static int digit(int n) {
		if(n < 10) {
			return 1;
		}
			return digit(n /10) + 1;
		
	}
	
	//Use recursion to compute an, where n is a positive integer. Hint: If n is 1, then an = a. If n is even, then an = (an/2)2. Otherwise, an = a * an–1.
	
	public static int power(int number, int pow) {
		if(pow == 1) {
			return number;
		}
		if(pow % 2 == 0) {
			return power(number, pow/2) * power(number, pow/2);
		}else {
			return number * power(number, pow - 1);
		}
				
	}
	
	//that tests whether a year is a leap year: that is, a year with 366 days. Exercise P3.28describes how to test whether a year is a leap year. In this exercise, use multiple ifstatements and return statements to return the result as soon as you know it.
	
	public static boolean isLeapYear(int year) {
		if(year % 100 == 0) {
			return false;
		}
		if(year % 400 == 0 || year % 4 == 0) {
			return true;
		}
		
		return false;
	}
	
	public static String digitName(int digit) {
		String result = "";
		if(digit == 1) {
			result = "one";
		}
		if(digit == 2) {
			result = "two";
		}
		if(digit == 3) {
			result = "three";
		}
		if(digit == 4) {
			result = "four";
		}
		if(digit == 5) {
			result = "five";
		}
		if(digit == 6) {
			result = "six";
		}
		if(digit == 7) {
			result = "seven";
		}
		if(digit ==8) {
			result = "eight";
		}
		if(digit == 9) {
			result = "nine";
		}
		return result;
	}
	
	public static String teenName(int number) {
		String result = "";
		if(number == 10) {
			result = "ten";
		}
		if(number == 11) {
			result = "eleven";
		}
		if(number == 12) {
			result = "twelve";
		}
		if(number == 13) {
			result = "thirteen";
		}
		if(number == 14) {
			result = "fourteen";
		}
		if(number == 15) {
			result = "fifthteen";
		}
		if(number == 16) {
			result = "sixteen";
		}
		if(number == 17) {
			result = "seventeen";
		}
		if(number == 18) {
			result = "eighteen";
		}
		if(number == 19) {
			result = "nineteen";
		}
		return result;
		
	}
	
	public static String tensName(int number) {
		String result = "";
		if(number / 10 == 2) {
			result = "twenty";
		}
		if(number / 10 == 3) {
			result = "tirthty";
		}
		if(number / 10 == 4) {
			result = "fourty";
		}
		if(number / 10 == 5) {
			result = "fifthty";
		}
		if(number / 10 == 6) {
			result = "sixty";
		}
		if(number / 10 == 7) {
			result = "seventy";
		}
		if(number / 10 == 8) {
			result = "eighty";
		}
		if(number / 10 == 9) {
			result = "ninety";
		}
		return result;
	}
	
	
	
	public static String intName(int number)
	 {
	 int part = number; // The part that still needs to be converted
	 String name = ""; // The name of the number
	
	 if( part == 0) {
		 System.out.println("zero");
		 System.exit(0);
	 }
	 
	 if(part < 0) {
		 name = name + " minus";
		 part = part * (-1);
	 }
	 
	 if(part >= 1000000000) {
		 name = name +  ( name.isEmpty() ? "" : " ")  + " " + intName(part / 1000000000) + " billion";
		 part = part % 1000000000;
	 }
	 
	 if(part >=1000000) {
		 name = name +  ( name.isEmpty() ? "" : " ")  + " " + intName(part / 1000000) + " million";
		 part = part % 1000000;
	 }
	 
	 if(part >= 1000){
		 name = name +  ( name.isEmpty() ? "" : " ")  + " " + intName(part / 1000) + " thousand";
		 part = part % 1000;
	 }
	 
	if (part >= 100)
	 {
	 name =name +  ( name.isEmpty() ? "" : " ")  + " " + digitName(part / 100) + " hundred";
	 part = part % 100;
	 }
	
	 if (part >= 20)
	 {
	 name = name +( name.isEmpty() ? "" : " ") + tensName(part);
	 part = part % 10;
	}
	 else if (part >= 10)
	 {
	 name = name + ( name.isEmpty() ? "" : " ") + " " + teenName(part);
	 part = 0;
	 }
	
	 if (part > 0)
	 {
	 name = name + ( name.isEmpty() ? "" : " ") + " " + digitName(part);
	 }
	
	 return name;
	 }
	

	
	
	public static void main(String args[]) {

		P51 object = new P51();
//		// P5.1 A
//		double smallest = object.smallest(10, -3, 67);
//		System.out.println("the smallest is " + smallest);
//		// P5.1 B
//		double avarage = object.avarage(10, 100, 50);
//		System.out.println("The avarage is " + avarage);
//		// P5.2 A
//		boolean alTheSame = object.allTheSame(10, 10, 10);
//		System.out.println(alTheSame);
//		// P5.2 B
//		boolean allDifferent = object.allDifferent(5, 7, 8);
//		System.out.println(allDifferent);
//		// P5.2 C
//		boolean sorted = object.sorted(5, 8, 7);
//		System.out.println(sorted);
//		// P5.3 A
//		int firstDigit = object.firstDigit(256);
//		System.out.println("First digit is " + firstDigit);
//		// P5.3 B
//		int lastDigit = object.lastDigit(256);
//		System.out.println("The last digit is " + lastDigit);
//		// P5.3 C
//		int digits = object.digits(256);
//		System.out.println("the number of digis is " + digits);
//		// P5.4
//		String middle = object.middle("Cavid");
//		System.out.println(middle);
//		// P5.5
//		String dublicate = object.repeat("cavid", 5);
//		System.out.println(dublicate);
//		//P5.6
//		int count = object.countVowels("Cavid");
//		System.out.println(count);
//		//P5.7
//		int countWords = object.countWords("Mary had little lamb");
//		System.out.println(countWords);
//		//P5.10
//		double salary = object.readDouble("Please enter your salary:");
//		System.out.println(salary);
//		//P5.14
//		String clock = object.getTimeName(10, 15);
//		System.out.println(clock);
		//P5.15
//		String word = object.reverse("flow");
//		System.out.println(word);
		//P5.16
//		boolean reverWord = object.isPalindrome("aibohphobia");
//		System.out.println(reverWord);
//		//P5.17
//		boolean b = object.find("Cavid", "vid");
//		System.out.println(b);
//		//P5.18
//		int digit = object.digit(230);
//		System.out.println(digit);
//		//P5.19
		int number = object.power(3, 4);
		System.out.println(number);
//		//P5.20
//		boolean answer = object.isLeapYear(1900);
//		System.out.println(answer);
//		//P5.11
//		String n = object.intName(20);
//		System.out.println(n);
//		String x = object.printAll(100);
//		System.out.println(x);
//	
//	
	
	
	
	}
}
