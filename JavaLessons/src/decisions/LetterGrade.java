package decisions;

import java.util.Scanner;

public class LetterGrade {

	public static void main(String args[]) {

		Scanner s = new Scanner(System.in);

		String letterGrade = null;

		double numericValueOfA = 4;
		double numericValueOfB = 3;
		double numericValueOfC = 2;
		double numericValueOfD = 1;
		double numericValueOfF = 0;
		System.out.println("Enter letter grade:");

		letterGrade = s.next();

		if (letterGrade.equalsIgnoreCase("a") || letterGrade.equalsIgnoreCase("a+")) {
			System.out.println(numericValueOfA);
		} else if (letterGrade.equalsIgnoreCase("b")) {
			System.out.println(numericValueOfB);
		} else if (letterGrade.equalsIgnoreCase("c")) {
			System.out.println(numericValueOfC);
		} else if (letterGrade.equalsIgnoreCase("d")) {
			System.out.println(numericValueOfD);
		} else if (letterGrade.equalsIgnoreCase("f") || letterGrade.equalsIgnoreCase("f+")
				|| letterGrade.equalsIgnoreCase("f-")) {
			System.out.println(numericValueOfF);
		} else if (letterGrade.equalsIgnoreCase("a-")) {
			System.out.println(numericValueOfA - 0.3);
		} else if (letterGrade.equalsIgnoreCase("b-")) {
			System.out.println(numericValueOfB - 0.3);
		} else if (letterGrade.equalsIgnoreCase("C-")) {
			System.out.println(numericValueOfC - 0.3);
		} else if (letterGrade.equalsIgnoreCase("D-")) {
			System.out.println(numericValueOfD - 0.3);
		} else if (letterGrade.equalsIgnoreCase("B+")) {
			System.out.println(numericValueOfB + 0.3);
		} else if (letterGrade.equalsIgnoreCase("C+")) {
			System.out.println(numericValueOfC + 0.3);
		} else if (letterGrade.equalsIgnoreCase("D+")) {
			System.out.println(numericValueOfD + 0.3);
		}

	}
}