package lesson10;

import java.util.Scanner;

public class Cone {
	
	 public static double coneVolume(double r, double h) {
		 
			return 1/3 * Math.PI * r * r * h;  
			
		 }


		  public static double coneSurface(double r, double h) {
			 
			 return Math.PI * r * r + Math.PI * r * Math.sqrt(h * h + r * r);                  
			 
		 }
		  
		  public Cone() {
			  
			  Scanner s = new Scanner(System.in);

				System.out.println("Enter radisu and heigth");
				
				int r = s.nextInt();
				
				int h = s.nextInt();
				
				System.out.println("Cone surface:     " + Geometry.coneSurface(r, h));
				
				System.out.println("Cone volume:      " + Geometry.coneVolume(r, h));
				
			  
		  }

}
