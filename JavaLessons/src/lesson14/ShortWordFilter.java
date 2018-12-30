package lesson14;

import java.util.ArrayList;
import java.util.Scanner;;

public class ShortWordFilter implements Filter {

	public boolean accept(Object x) {

		String s = (String) x;

		if (s.length() < 5) {

			return true;
		}
		return false;

	}
}