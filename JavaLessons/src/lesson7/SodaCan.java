package lesson7;

public class SodaCan {

	int heigth;
	
	int  radius;
	
	public SodaCan(int heigth , int radius) {
		
		this.heigth = heigth;
		
		this.radius = radius;
		
		
		}
	
	
	public double getSurfaceArea() {
		
	return 	2 * Math.PI * radius * heigth + 2 * Math.PI * radius * radius;
		
	}
	
	public double getVolume() {
		
	return Math.PI * radius * radius * heigth;
		
		
	}
	
	
	
	
}
