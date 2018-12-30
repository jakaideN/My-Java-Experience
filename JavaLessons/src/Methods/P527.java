package Methods;

import java.util.function.ToDoubleBiFunction;

public class P527 {

	public static int value(char c) {

		switch (c) {
		case 'M':
			return 1000;
		case 'D':
			return 500;
		case 'C':
			return 100;
		case 'L':
			return 50;
		case 'X':
			return 10;
		case 'V':
			return 5;
		case 'I':
			return 1;
		default:
			return -1;
		}
	}

	public static int convertRomanNumberToInteger(String romanNumber) {
		int total = 0;

		while (romanNumber.length() > 0) {
			if (romanNumber.length() == 1 || P527.value(romanNumber.charAt(0)) >= P527.value(romanNumber.charAt(1)) ) {
				total += P527.value(romanNumber.charAt(0));
				romanNumber = romanNumber.substring(1, romanNumber.length());
			} else {
				total += P527.value(romanNumber.charAt(1)) - P527.value(romanNumber.charAt(0));
				romanNumber = romanNumber.substring(2, romanNumber.length());
				}
		}

		// for (int i = 0; i < romanNumber.length()-1; i++) {
		// if (P527.value(romanNumber.charAt(i)) >= P527.value(romanNumber.charAt(i+1))
		// || romanNumber.length() == 1) {
		// total += P527.value(romanNumber.charAt(i));
		// romanNumber = romanNumber.substring(i, romanNumber.length());
		// } else {
		// total += P527.value(romanNumber.charAt(i + 1)) -
		// P527.value(romanNumber.charAt(i));
		// romanNumber = romanNumber.substring(i + 1, romanNumber.length());
		// }
		// }
		return total;
	}

	public static void main(String args[]) {

		P527 object = new P527();

		int decimalNumber = object.convertRomanNumberToInteger("MCMLXXVIII");
		System.out.println(decimalNumber);
	}

}
