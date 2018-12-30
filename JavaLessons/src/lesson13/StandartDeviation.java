package lesson13;

import java.util.ArrayList;
import java.util.Scanner;

public class StandartDeviation {

	private double numbers;

	public double getNumbers() {
		return numbers;
	}

	public void setNumbers(int numbers) {
		this.numbers = numbers;
	}

	public static void main(String args[]) {

		ArrayList <Double> list = new ArrayList<>();
		
		StandartDeviation b = new StandartDeviation();

		double numbers = b.getNumbers();

		Scanner s = new Scanner(System.in);

		boolean condition = false;

		while (!condition) {

			System.out.println("Enter command.You can only write 'add', and 'exit'.");
	
			String answer = s.next();
		
			
			
			if (answer.equalsIgnoreCase("exit")) {

				System.out.println("The program end...");

				condition = true;
			}

			if (answer.equalsIgnoreCase("add")) {

				System.out.println("Enter any numbers.");

				boolean nameEntered = false;

				while (!nameEntered) {

					String numStr = s.next();
					
					
					try {
						if (numStr.equalsIgnoreCase("exit")) {
							nameEntered = true;
							condition = true;
						}
						numbers = Double.parseDouble(numStr);
						list.add(numbers);
					} catch (NumberFormatException e) {
						if (numStr.equalsIgnoreCase("exit")) {
							System.out.println("The program end...");
							nameEntered = true;
							condition = true;
						}else {
						System.out.println("Numbers only accepts digits");
						System.out.println("Enter any number.");
						}
					}

				}

			}			

			System.out.println("Count of numbers is \t" + list.size());
			
			
			double sum = 0;
			for (int i = 0; i< list.size(); i++) {
				
				sum = sum + list.get(i);
				
			}
			
			double avarage = sum/list.size();
			
			System.out.println("avarage is \t\t" + avarage);
			
			double squareSum = 0;
			
			for(int i = 0; i < list.size(); i++) {
				
				squareSum = squareSum + (list.get(i) * list.get(i));
				
			}
		
		double standatDeviation = Math.sqrt((squareSum - (1/list.size() * sum * sum))/list.size() - 1);
		
		System.out.println("Standart deviation is   " + standatDeviation);
		
	}
}
}
