package loops;

import java.util.Scanner;

public class P433 {
	
		private static  double A = 0;
	
		private static  double B = 0;
		
		private static  double C = 0;
		
		private static  double D = 0;
		
		private static double preyPrev = 0;
		
		private static double predPrev = 0;
		
		private static int period = 0;
		
		private static double prey = 0;
		
		private static double preyNext = 0;

		private static double pred = 0;

		private static double predNext = 0;
		
		
	public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("A: ");
        
        A = in.nextDouble();
        
        System.out.println("B: ");
        
        B = in.nextDouble();
        
        System.out.println("C: ");
        
        C = in.nextDouble();
        
        System.out.println("D ");
        
        D = in.nextDouble();
        
        System.out.println("Enter population of prey");
        
        preyPrev = in.nextDouble();
        
        System.out.println("Enter the population of predator");
        
        predPrev = in.nextDouble();
        
        System.out.println("Enter the period");
        
        period = in.nextInt();
        
        System.out.println("period,prey,predator");
        
        for(int i = 1; i <= period; i ++) {
        	
        	preyNext = preyPrev * (1 + A - B * predPrev);
        	
        	predNext = predPrev * (1 - C + D * preyPrev);
        	
        	preyPrev = preyNext;
        
        	predPrev = predNext;
       
        	System.out.println(i + "," + preyNext + "," + predNext);
        	
        	
        	}
        
        
       
        
        
        
}
}
