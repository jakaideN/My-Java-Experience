package Methods;
import java.util.Scanner;
public class P528 {
	
	public static int amountPerChild(int numberOfChildren, int houseHold) {
		int amountPerChild = 0;
		if(houseHold >= 30000 && houseHold <= 40000) {
			amountPerChild = 1000 * numberOfChildren;
		}else if (houseHold >= 20000 && houseHold < 30000) {
			amountPerChild = 1500 * numberOfChildren;
		}else if (houseHold < 20000) {
			amountPerChild = 2000 * numberOfChildren;
		}
		return amountPerChild;
	}
	
	
	public static void main (String args[]) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the number of children of the family");
		int numberOfChildren = in.nextInt();
		
		System.out.println("Enter the household of the family");
		int houseHold = in.nextInt();
		
		System.out.println("amount of financal assistance is " + P528.amountPerChild(numberOfChildren, houseHold));
	}

}
