package lesson14;

public class LongWordFilter implements Filter{

	public boolean accept(Object x) {

		String s = (String) x;

		if (s.length() > 5) {

			return true;
		}
		return false;

	}
	
}
