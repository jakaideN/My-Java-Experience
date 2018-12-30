package decisions;
import java.util.Scanner;
public class PhoneNumber {
	
	public static void main(String args[]) {
	
	Scanner s = new Scanner(System.in);
	
	System.out.println("Enter ten-digit phone number");
	
	String number = s.next();
	
	String areaCode = number.substring(0, 3);
	
	String first = number.substring(3, 6);
	
	String second = number.substring(6, number.length());
	
	System.out.println("(" + areaCode + ")" + " " + first + "-" + second);
	
	

	
	
}
}