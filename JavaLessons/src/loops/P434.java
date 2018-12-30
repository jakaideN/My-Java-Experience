package loops;

public class P434 {
	
	private static final double DELTA_T = 0.01;
	
	private static final double g = 9.81;
	
	private static double s = 0;
	
	private static double sTest = 0;
	
	private static double v = 100;
	
	public static void main(String args[]) {
		
		int count = 1;
		
		while(v >= 0) {
				
		s = s + v * DELTA_T;
		
		v = v- g * DELTA_T;
	
		if(count == 100) {
		System.out.println("the distance is  " + s);
		count = 1;
		}
		count++;
		}
		
		
		sTest = -1/2 * g * DELTA_T * DELTA_T + v * DELTA_T ;
	
		System.out.println("the other distance formula for comparison  " + sTest);
	}
	
	

}
