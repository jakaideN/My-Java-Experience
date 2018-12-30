package decisions;

import java.util.ArrayList;

import java.util.Scanner;

public class GPATest {

	public static void main(String args[]) {

		Double results = 0.0;

		String degree = null;

		ArrayList goodDegree = new ArrayList<>();

		ArrayList badDegree = new ArrayList<>();

		Scanner s = new Scanner(System.in);

		System.out.println("Write the degree of students.If you write exit the will end: ");

		boolean condition = false;

		while (!condition) {

			degree = s.next();

			if (!degree.equalsIgnoreCase("exit")) {

				results = Double.parseDouble(degree);

				if (results >= 1.5 && results <= 2.0) {

					goodDegree.add(results);

				} else if (results < 1.5) {

					badDegree.add(results);

				}

			}

			if (degree.equalsIgnoreCase("exit")) {

				condition = true;
			}
		}

		System.out.println("The student is on probation: ");

		for (int i = 0; i < goodDegree.size(); i++) {

			System.out.println(goodDegree.get(i));

		}
		System.out.println("The student is failing: ");

		for (int i = 0; i < badDegree.size(); i++) {

			System.out.println(badDegree.get(i));
			
			
		}

	}

}
