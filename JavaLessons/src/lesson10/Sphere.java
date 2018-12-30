package lesson10;

import java.util.Scanner;

public class Sphere {

	public static double sphereVolume(double r) {
		
		return 4/3 * Math.PI * r * r * r;                   
		}


		 public static double sphereSurface(double r) {
			 
			 return 4 * Math.PI * r * r;
			 
		 }
		 
		 public Sphere() {
			 
			 Scanner s = new Scanner(System.in);

				System.out.println("Enter radisu and heigth");
				
				int r = s.nextInt();
				
				int h = s.nextInt();
				
				System.out.println("Sphere surface:   " + Geometry.sphereSurface(r));
				
				System.out.println("Sphere volume:    " + Geometry.sphereVolume(r));
			 
			 
		 }
	
}
