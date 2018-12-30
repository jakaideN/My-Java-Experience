package decisions;

import java.util.Scanner;

public class P324 {

	public static void main(String args[]) {

		// double gal = 0;
		//
		// double g = 0;
		//
		// double kg = 0;
		//
		// double oz = 0;
		//
		// double lb = 0;
		//
		// double ml = 0;
		//
		// double l = 0;
		//
		// double floz = 0;

		Scanner s = new Scanner(System.in);

		System.out.println("Convert from? ");

		String convertFrom = s.next();

		System.out.println("Convert to? ");

		String convertTo = s.next();

		System.out.println("Value: ");

		double value = s.nextDouble();

		double result = 0;

		if (isWeigth(convertFrom) != isWeigth(convertTo)) {

			System.exit(0);

		} else {

			 if (convertFrom.equalsIgnoreCase("gal") &&
			 convertTo.equalsIgnoreCase("fl.oz")) {
//			
//			 value * Double.parseDouble(convertFrom) = 128 * value
//			 Double.parseDouble(convertTo);
			 
			
			 result = value * 128;
			 }else if (convertFrom.equalsIgnoreCase("fl.oz") &&
			 convertTo.equalsIgnoreCase("gal")) {
			 result = value / 128;
			 }else if (convertFrom.equalsIgnoreCase("oz") &&
			 convertTo.equalsIgnoreCase("lb")) {
			 result = value / 16;
			 }else if (convertFrom.equalsIgnoreCase("lb") &&
			 convertTo.equalsIgnoreCase("oz")) {
			 result = value * 16;
			 }else if (convertFrom.equalsIgnoreCase("ml") &&
			 convertTo.equalsIgnoreCase("l")) {
			 result = value / 1000;
			 }else if (convertFrom.equalsIgnoreCase("l") &&
			 convertTo.equalsIgnoreCase("m")) {
			 result = value * 1000;
			 }else if (convertFrom.equalsIgnoreCase("g") &&
			 convertTo.equalsIgnoreCase("kg")) {
			 result = value / 128;
			 }else if (convertFrom.equalsIgnoreCase("kg") &&
			 convertTo.equalsIgnoreCase("g")) {
			 result = value / 128;
			 }

//			if (convertFrom.equalsIgnoreCase("fl.oz")) {
//
//				if (convertTo.equalsIgnoreCase("gal")) {
//					result = 0.0078125 * value;
//				} else if (convertTo.equalsIgnoreCase("l")) {
//					result = 0.0295735296875 * value;
//				} else if (convertTo.equalsIgnoreCase("g")) {
//					result = 29.5735296875 * value;
//				} else if (convertTo.equalsIgnoreCase("kg")) {
//					result = 29.5735296875 * 1000 * value;
//				} else if (convertTo.equalsIgnoreCase("ml")) {
//					result = 0.0295735296875 / 1000 * value;
//				} else if (convertTo.equalsIgnoreCase("lb")) {
//					result = 0.065 * value;
//				}
//			}
//
//			if (convertFrom.equalsIgnoreCase("gal")) {
//
//				if (convertTo.equalsIgnoreCase("fl.oz")) {
//					result =value / 0.0078125 ;
//				}
//			}

		}

		System.out.println(result);

	}

	public static boolean isWeigth(String str) {

		return str.equalsIgnoreCase("fl.oz") || str.equalsIgnoreCase("gal") || str.equalsIgnoreCase("oz")
				|| str.equalsIgnoreCase("lb") || str.equalsIgnoreCase("ml") || str.equalsIgnoreCase("l")
				|| str.equalsIgnoreCase("g") || str.equalsIgnoreCase("kg");

	}
}
