package decisions;

import java.util.Scanner;

public class P314 {

	public static void main(String args[]) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter your card:");

		String cardName = s.next().toUpperCase();

		String cardValue = null;

		String groups = null;

		char firstPart = cardName.charAt(0);

		char secondPart = cardName.charAt(1);
		// String cardValue = cardName.substring(0, 1);

		String of = " of ";

		String A = "Ace";

		String J = "Jack";

		String Q = "Queen";

		String K = "King";

		String D = "Diamond";

		String H = "Heart";

		String S = "Spade";

		String C = "Club";
		
		if (Character.isDigit(firstPart)) {
			int num = Integer.parseInt(firstPart + "");
			if(num >= 2 && num <= 10) {
				cardValue = firstPart + "";
			}
		} else if (firstPart == 'A') {
			cardValue = A;
		} else if (firstPart == 'Q') {
			cardValue = Q;
		} else if (firstPart == 'K') {
			cardValue = K;
		} else if (firstPart == 'J') {
			cardValue = J;
		}
//		} else {
//			cardValue = firstPart + "";
//		}

		if (secondPart == 'D') {
			groups = D;
		} else if (secondPart == 'C') {
			groups = C;
		} else if (secondPart == 'S') {
			groups = S;
		} else if (secondPart == 'C') {
			groups = H;
		}

		String result = cardValue + " of " + groups;

		System.out.println(result);

		// if (cardName.equalsIgnoreCase("QS")) {
		// cardName = Q + of + S;
		// System.out.println(cardName);
		// }
		// else if (cardName.equalsIgnoreCase("QD")) {
		// cardName = Q + of + D;
		// System.out.println(cardName);
		// }
		// else if (cardName.equalsIgnoreCase("QH")) {
		// cardName = Q + of + H;
		// System.out.println(cardName);
		// }
		// else if (cardName.equalsIgnoreCase("QC")) {
		// cardName = Q + of + C;
		// System.out.println(cardName);
		// }
		// else if (cardName.equalsIgnoreCase("KH")) {
		// cardName = K + of + H;
		// System.out.println(cardName);
		// }
		// else if (cardName.equalsIgnoreCase("KS")) {
		// cardName = K + of + S;
		// System.out.println(cardName);
		// }else if(cardName.equalsIgnoreCase("KD")){
		// cardName = K + of + D;
		// System.out.println(cardName);
		// }else if(cardName.equalsIgnoreCase("KC")){
		// cardName = K + of + C;
		// System.out.println(cardName);
		// }else if(cardName.equalsIgnoreCase("JS")){
		// cardName = J + of + S;
		// System.out.println(cardName);
		// }else if(cardName.equalsIgnoreCase("JC")){
		// cardName = J + of + C;
		// System.out.println(cardName);
		// }else if(cardName.equalsIgnoreCase("JD")){
		// cardName = J + of + D;
		// System.out.println(cardName);
		// }else if(cardName.equalsIgnoreCase("JH")){
		// cardName = J + of + H;
		// System.out.println(cardName);
		// }else if(cardName.equalsIgnoreCase("AH")){
		// cardName = A + of + H;
		// System.out.println(cardName);
		// }else if(cardName.equalsIgnoreCase("AC")){
		// cardName = A + of + C;
		// System.out.println(cardName);
		// }else if(cardName.equalsIgnoreCase("AD")){
		// cardName = A + of + D;
		// System.out.println(cardName);
		// }else if(cardName.equalsIgnoreCase("AS")){
		// cardName = A + of + S;
		// System.out.println(cardName);
		// }else if(cardName.equalsIgnoreCase(cardValue + "S")){
		// cardName = cardValue + " " + S;
		// System.out.println(cardName);
		// }else if(cardName.equalsIgnoreCase(cardValue + "H")){
		// cardName = cardValue + " " + H;
		// System.out.println(cardName);
		// }else if(cardName.equalsIgnoreCase(cardValue + "D")){
		// cardName = cardValue + " " + D;
		// System.out.println(cardName);
		// }else if(cardName.equalsIgnoreCase(cardValue + "C")){
		// cardName = cardValue + " " + C;
		// System.out.println(cardName);
		// }

	}
}