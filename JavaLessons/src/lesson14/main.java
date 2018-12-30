package lesson14;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
	public static void main(String args[]) {

		ArrayList<Object> list = new ArrayList();

		Scanner s = new Scanner(System.in);
		System.out.println("Enter 7 word");

		for (int i = 0; i < 7; i++) {

			String strings = s.next();

			list.add(strings);

		}

		ArrayList<Object> shortList = Filter.collectAll(list, new ShortWordFilter());

		System.out.println("Short words:");
		for (int i = 0; i < shortList.size(); i++) {

			System.out.println(shortList.get(i));

		}

		ArrayList<Object> longList = Filter.collectAll(list, new LongWordFilter());
		System.out.println("Long words:");

		for (int i = 0; i < longList.size(); i++) {

			System.out.println(longList.get(i));

		}

		// Filter f = new ShortWordFilter();
		// System.out.println(f.accept("Gadi"));
	}

}
