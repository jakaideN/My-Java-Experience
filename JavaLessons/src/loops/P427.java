package loops;

import java.util.Scanner;

public class P427 {

	public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        
        double valueInDollar = 0;
        
        double valueInYen = 0;
        
        double yen = 0;
        
        double dollar = 0;

        System.out.println("Please enter today's of one dollar in yen");
        
        double oneDollarInYen = in.nextDouble();
        
        System.out.println("please enter a value (in dollar)");

        
        while(in.hasNext()) {
    
            valueInDollar = in.nextDouble();
            
            if(valueInDollar == 0) {
            	break;
            }
            
            yen = valueInDollar * oneDollarInYen;

            System.out.println("your value in yen:  " + yen);

        }
        
    	System.out.println("please enter a value (in yen)");
        
        while(in.hasNext()) {
        	
        	
        	valueInYen = in.nextDouble();
        	
        	if(valueInYen == 0) {
        		break;
        	}
        	
        	dollar = valueInYen / oneDollarInYen;
        	
        	System.out.println("your value in dollar " + dollar);
        	
        }
        
        
                
        
        
        
		
		
}
}
