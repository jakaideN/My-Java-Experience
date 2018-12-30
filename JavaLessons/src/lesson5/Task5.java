package lesson5;

public class Task5 {
	
	public static double sphereVolume(double r) {
		
		return 4/3 * Math.PI * Math.pow(r, 3);
}
	
	public static double sphereSurface(double r) {

		return 4 * Math.PI * r * r;
}

	public static double cylinderVolume(double r, double h) {
				
		return Math.PI * r * r * h;
}
	
	public static double cylinderSurface(double r, double h) {
				
		return h * cylinderVolume(r , h);
		
		
}

	public static double coneVolume(double r, double h) {
		
		return 3/1 * cylinderVolume(r , h);
}

	public static double coneSurface(double r, double h) {
		
		return Math.PI * r * r + Math.PI * r * Math.sqrt(h * h + r * r);
}

	
		
		
	}
	
	
			
