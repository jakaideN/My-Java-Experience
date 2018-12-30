package Tekrar1;

public class Loops {

	/*
	 * 
	 * 1. Write programs with loops that compute 
	 * a). 
	 * b)
	 * c). 
	 * 
	 * e)The sum of all odd digits of an input. (For example, if the input is 32677, the sum would be 3 + 7 + 7 = 17.)
	 * 
	 * 
	 * 2. Write programs that read a line of input as a string and print a)Only the
	 * upperCase letters in the string. b)Every second letter of the string. c)The
	 * string, with all vowels replaced by an underscore. d)The number of vowels in
	 * the string. e)The positions of all vowels in the string.
	 * 
	 * 
	 * 3. Write a program that reads a word and prints the word in reverse. For
	 * example, if the user provides the input "Harry", the program prints yrraH
	 * 
	 * 
	 * 
	 * 4. Write methods
	 * 
	 * public static double sphereVolume(double r) public static double
	 * sphereSurface(double r) public static double cylinderVolume(double r, double
	 * h) public static double cylinderSurface(double r, double h) public static
	 * double coneVolume(double r, double h) public static double coneSurface(double
	 * r, double h)
	 * 
	 * that compute the volume and surface area of a sphere with radius r, a
	 * cylinder with a circular base with radius r and height h, and a cone with a
	 * circular base with radius r and height h. Then write a program that prompts
	 * the user for the values of r and h, calls the six methods, and prints the
	 * results.
	 */

	public static void main(String args[]) {

		// TASK 1 a)The sum of all even number between 2 and 100 (inclusive)

		int sum = 0;

		for (int i = 2; i <= 100; i += 2) {

			sum = sum + i;
			System.out.println(sum);
		}
		// TASK1 b)The sum of all squares between 1 and 10(inclusive).

		double sum1 = 0;

		for (int i = 1; i <= 100; i++) {

			double square = Math.pow(i, 2);

			sum1 = sum1 + square;
			System.out.println(sum1);
		}
		
		//TASK1 c)All powers of 2 from 20 up to 220
		
		int eded = 2;
		
		for (int i = 20; i < 220; i++) {
			
		double c = Math.pow(eded, i);	
			
		System.out.println(c);
		}
		
		//Task1 d)The sum of all odd numbers between a and b (inclusive), where a and b are inputs
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
}
