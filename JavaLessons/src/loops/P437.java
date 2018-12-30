package loops;import lesson10.Cone;

public class P437 {
	
	private static double Ps = 0;

	private static double R0 = 20;
	
	private static double Rs = 8;
	
	private static double n = 0.01;
	
	public static double Vs = 40;
	
	public static double P5Prev = 0;
	
	public static double maxValueOfPower = 0;
	
	public static void main (String args[]) {
		
		System.out.println("n, Ps");
		
		while(n <= 2) {
			
			Ps = Rs * Math.pow( ( (n * Vs)/ (n * n * R0 + Rs) ), 2);
			
			maxValueOfPower = Math.max(P5Prev, Ps);
			
			P5Prev = Ps;
			
			System.out.println(n + ", " + Ps);
			
			n += 0.01;
		}
		
		System.out.println(maxValueOfPower);
		
	}
	
	
}
