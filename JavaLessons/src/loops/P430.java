package loops;

import java.nio.Buffer;
import java.util.Scanner;

public class P430 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		boolean condition = true;

		boolean found = true;

		int buyTicket = 0;

		int count = 0;

		int numberOfTickets = 100;

		Condition: while (condition) {

			if (numberOfTickets <= 0) {
				break Condition;
			}

			Found: while (found) {
				if (numberOfTickets == 0) {
					break Condition;
				}
				System.out.println("enter how many ticket you will buy");

				buyTicket = in.nextInt();

				if (buyTicket <= 4 && numberOfTickets - buyTicket >= 0) {
					numberOfTickets -= buyTicket;
					System.out.println(numberOfTickets + " tickets remain");

					break Found;
				} else if (buyTicket > 4) {
					System.out.println("you can buy as many as 4 tickets\n");
				} else if (buyTicket > numberOfTickets) {
					System.out.println("only " + numberOfTickets + " tickets left");
				}
			}

			count++;

			found = true;
		}

		System.out.println(count + " person buy ticket");

	}
}
