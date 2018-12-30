package lesson10;

import java.util.Scanner;

public class Cylinder {

	public static double cylinderVolume(double r, double h) {
		 
		 return Math.PI * r * r * h;
		 
	 }
	 
	 public static double cylinderSurface(double r, double h) {
		 
		 return 2 * Math.PI * r * 2 + 2 * Math.PI * r * h;                
	 }
	 
	 
	 public Cylinder() {
		 
		 Scanner s = new Scanner(System.in);

			System.out.println("Enter radisu and heigth");
			
			int r = s.nextInt();
			
			int h = s.nextInt();
			
			System.out.println("Cylinder surface: " + Geometry.cylinderSurface(r, h));
			
			System.out.println("Cylinder volume:  " + Geometry.cylinderVolume(r, h));
	 }
	 
	 
}
