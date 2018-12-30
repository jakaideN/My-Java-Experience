package decisions;

import java.util.Scanner;

public class P3299 {

	public static void main(String args[]) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter country");

		String country = s.nextLine();

		char endCharacter = country.charAt(country.length() - 1);

		if (country.equalsIgnoreCase("Etats-Unis") || country.equalsIgnoreCase("Pays-Bas")) {
			System.out.println("les" + " " + country);
			
		}
		
		else if (endCharacter == 'e') {
			
			if (country.equalsIgnoreCase("Belieze") || country.equalsIgnoreCase("Cambodge")
					|| country.equalsIgnoreCase("Mexique") || country.equalsIgnoreCase("Mozambique")
					|| country.equalsIgnoreCase("Zaiire") || country.equalsIgnoreCase("Zimbabwe")) {

				System.out.println("le" + " " + country);
				
				System.exit(0);
			}
			

			System.out.println("la" + " " + country);
		} else {
			System.out.println("le" + " " + country);
		}

	}
}
