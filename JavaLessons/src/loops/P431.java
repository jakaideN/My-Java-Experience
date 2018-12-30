package loops;

import java.util.Scanner;

public class P431 {
	
	 private  static boolean condition = true;
	
     private final static double MAXIMUM_OF_MEMBERS = 100;
     
     private static int groups = 0;
     
     private static int occupance = 0;


	public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
	
        
        while(condition) {
        	
        	groups = in.nextInt(); 
        	
        	if(groups + occupance <= MAXIMUM_OF_MEMBERS) {
            	occupance = occupance + groups;
            	System.out.println("occupance: " + occupance);
        	}else {
        		System.out.println("The group cannot enter the bar");
        	}
     
        	if(occupance == 100) {
        		System.out.println("report: bar as full");
        		break;
        	}
        	
        }
        
        
	
	}
}
