package decisions;

import java.util.Scanner;

public class P338 {

	public static void main(String args[]) {

		Scanner s = new Scanner(System.in);

		boolean dashboardForLeft = false;

		boolean dashboardForRight = false;

		boolean childLook = false;

		boolean masterUnlock = false;

		boolean leftInsideHandle = false;

		boolean leftOutsideHandle = false;

		boolean rightInsideHandle = false;

		boolean rightOutsideHandle = false;

		boolean gearShift = false;

		System.out.println("Enter a command");

		String command = s.next();

		if (command.substring(0, 1).equalsIgnoreCase("1")) {
			dashboardForLeft = true;
		}
		if (command.substring(1, 2).equalsIgnoreCase("1")) {
			dashboardForRight = true;
		}
		if (command.substring(2, 3).equalsIgnoreCase("1")) {
			childLook = true;
		}
		if (command.substring(3, 4).equalsIgnoreCase("1")) {
			masterUnlock = true;
		}
		if (command.substring(4, 5).equalsIgnoreCase("1")) {
			leftInsideHandle = true;
		}
		if (command.substring(5, 6).equalsIgnoreCase("1")) {
			leftOutsideHandle = true;
		}
		if (command.substring(6, 7).equalsIgnoreCase("1")) {
			rightInsideHandle = true;
		}
		if (command.substring(7, 8).equalsIgnoreCase("1")) {
			rightOutsideHandle = true;
		}
		if (command.substring(8, 9).equalsIgnoreCase("P")) {
			gearShift = true;
		}

		if (masterUnlock == false) {
			System.out.println("both doors stay closed");
			System.exit(0);
		} else if (gearShift == false) {
			System.out.println("both doors stay closed");
			System.exit(0);
		} else if (childLook == true) {
			leftInsideHandle = false;
			rightInsideHandle = false;
		}

		if (dashboardForLeft == true || leftInsideHandle == true || leftOutsideHandle == true) {
			System.out.println("Left door opens");
		} else if (dashboardForRight == true || rightInsideHandle == true || rightOutsideHandle == true) {
			System.out.println("Right door opens");
		} else {
			System.out.println("both doors stay closed");
			System.exit(0);
		}

	}
}
