package game;

import java.util.ArrayList;
import java.util.Scanner;

public class AdGunu {

	public static void main(String args[]) {
		
		Scanner s = new Scanner(System.in);
		
		boolean condition = false;
		
		while(!condition) {
		
		String Day = s.next();
		
		if(Day.equalsIgnoreCase("Cavid")) {
			System.out.println("13.06.2000");
		}else if(Day.equalsIgnoreCase("Orxan")) {
			System.out.println("23.07.2000");
		}else if (Day.equalsIgnoreCase("Faiq")) {
			System.out.println("11.01.2000");
		}else if(Day.equalsIgnoreCase("Yasin")) {
			System.out.println("Adı düzgün daxil edin: YASİNS");
		}else if (Day.equalsIgnoreCase("stop")) {
			condition = true;
		}
		else {
			System.out.println("Belə adlı uşaq yoxdur");
		}
		
			
		
		}
		
	}
	
	
}
