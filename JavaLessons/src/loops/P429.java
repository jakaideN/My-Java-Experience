package loops;

import java.util.Scanner;

public class P429 {
	
	public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
	
        System.out.println("enter the target price");
        
        double targetPrice = in.nextDouble();
        
        boolean target = true;
        
        double stockPrice = 0;
        
        while(target) {
        	
        stockPrice = in.nextDouble();
        
        if(stockPrice > targetPrice) {
        	System.out.println("you exceed the target price");
        	target = false;
        }
        	
        }
        
        
        
}
}