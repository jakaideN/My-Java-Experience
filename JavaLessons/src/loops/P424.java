package loops;

import java.util.Scanner;

public class P424 {
	
public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in);
		
		int goat1 = 0;
		
		int goat2 = 0;
		
		int	choiceOfHost = 0;
		
		int counter1 = 0;
		
		int previousChoiceOfHuman = 0;
		
		int doorOfCar = 0;
			
		int choiceOfHuman = 0;
		
		boolean condition = true;
		
		int counter2 = 0;
		
		
		
		
		
		
		
		for(int i = 0; i<= 1000; i++) {
			
			int choice  =(int) (Math.random() * 2);
		
		doorOfCar = (int) (Math.random() * 3) + 1;
		
		System.out.println("door of car is: " + doorOfCar);
		
		choiceOfHuman =  (int) (Math.random() * 3) + 1;
		
		while(condition) {
			
			 goat1 = (int) (Math.random() * 3) + 1;
			
			 goat2 = (int) (Math.random() * 3) + 1;
					
			if(goat1 !=doorOfCar && goat2 !=doorOfCar && goat1 != goat2) {
				break;
			}
		}
		
		System.out.println("goat1 is " + goat1);
		
		System.out.println("goat2 is " + goat2);
		
		System.out.println("Choice of human is " + choiceOfHuman);
		
		
		while(condition) {
			
			choiceOfHost =  (int) (Math.random() * 3) + 1;
				
				if(choiceOfHost != doorOfCar && choiceOfHost !=choiceOfHuman) {
					break;
				}
			}
		
		System.out.println("choiceOfHost is " + choiceOfHost);
		
		previousChoiceOfHuman = choiceOfHuman;
		
//		System.out.println(previousChoiceOfHuman);
		
//		System.out.println(choiceOfHost);
		
		if(choice ==0) {
		
		while(condition) {
			
		 choiceOfHuman =  (int) (Math.random() * 3) + 1;
			
			if(choiceOfHuman != previousChoiceOfHuman && choiceOfHuman != choiceOfHost) {
				break;
			}
		}
		
		if(choiceOfHuman == doorOfCar) {
			counter1++;
		}
		
		}
		
		System.out.println("second choice of human is " + choiceOfHuman);
		

		if(choiceOfHuman == doorOfCar) {
			counter2++;
		}

		}
		System.out.println("counter1 is " + counter1);
		
		System.out.println("counter2 is " + counter2);
	}
}