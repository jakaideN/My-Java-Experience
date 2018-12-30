package lesson10;

import java.util.Scanner;

public class Geometry {

	public static double sphereVolume(double r) {
	
	return 4/3 * Math.PI * r * r * r;                   
	}


	 public static double sphereSurface(double r) {
		 
		 return 4 * Math.PI * r * r;
		 
	 }

	 
	 public static double cylinderVolume(double r, double h) {
		 
		 return Math.PI * r * r * h;
		 
	 }
	 
	 public static double cylinderSurface(double r, double h) {
		 
		 return 2 * Math.PI * r * 2 + 2 * Math.PI * r * h;                
	 }
	 
	 
	 public static double coneVolume(double r, double h) {
		 
		return 1/3 * Math.PI * r * r * h;  
		
	 }


	  public static double coneSurface(double r, double h) {
		 
		 return Math.PI * r * r + Math.PI * r * Math.sqrt(h * h + r * r);                  
		 
	 }
	  
		

	  
	  public Geometry() {
		  
		 
			
			Scanner s = new Scanner(System.in);

			System.out.println("Enter radisu and heigth");
			
			int r = s.nextInt();
			
			int h = s.nextInt();
			
			System.out.println("Cone surface:     " + Geometry.coneSurface(r, h));
			
			System.out.println("Cone volume:      " + Geometry.coneVolume(r, h));
			
			System.out.println("Cylinder surface: " + Geometry.cylinderSurface(r, h));
			
			System.out.println("Cylinder volume:  " + Geometry.cylinderVolume(r, h));
			
			System.out.println("Sphere surface:   " + Geometry.sphereSurface(r));
			
			System.out.println("Sphere volume:    " + Geometry.sphereVolume(r));
		  
		  
		  
		  
	  }
	 
		}















