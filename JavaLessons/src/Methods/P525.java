package Methods;

import java.security.Principal;

public class P525 {
//
//	public static void printDigit(int digit) {
//		switch (digit) {
//		case 0: System.out.print("||:::"); break;
//		case 1: System.out.print(":::||"); break;
//		case 2: System.out.print("::|:|"); break;
//		case 3: System.out.print("::||:"); break;
//		case 4:	System.out.print(":|::|"); break;
//		case 5: System.out.print(":|:|:"); break;
//		case 6: System.out.print(":||::"); break;
//		case 7: System.out.print("|:::|"); break;
//		case 8: System.out.print("|::|:"); break;
//		case 9: System.out.print("|:|::"); break;
//		}
//	}
//	
//	public static void printBarCode(int zipCode) {
//		int x = 0;
//		String s = zipCode + "";
//		System.out.print("|");
//		for(int i = 0; i < s.length(); i++) {
//			x = Integer.parseInt(s.substring(i, i + 1));
//			printDigit(x);
//		}
//		System.out.print("|");
//	}
	
	
	public static void converter(String x) {
		for(int i = 0; i < x.length(); i++) {
			
		}
	}
	
	public static void divide(String n) {
		String subsN = n.substring(1, n.length()-1);
		String firstPart = subsN.substring(0, 5);
		String secondPart = subsN.substring(5, 10);
		String thirdPart = subsN.substring(10, 15);
		String fourthPart = subsN.substring(15, 20);
		String fifthPart = subsN.substring(20, 25);
	}
	
	
	
	public static void printZipcode(String barcode) {
		for(int i = 0; i < barcode.length(); i++) {
		String part = barcode.substring(i, i+1);
//		printZeroAndOne(part);
		}
		
		
		
	}
	
	
	
	
	

	
	
	
	
	
	public static void main(String args[]) {

		P525 object = new P525();

//		object.printDigit(9);
//		
//		object.printBarCode(95014);
		
		object.printZipcode("|||::::|:|:::||::|::|||:::|");
	}
}
