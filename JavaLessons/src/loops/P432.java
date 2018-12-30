package loops;

import java.util.Scanner;

import decisions.DigitOfNumbers;

public class P432 {

	public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        
        double y = 0;
        
        String firstStepForCard1 = "";
        
        String nextCard = "";
        
        int firstSum = 0;
        
        int secondSum = 0;
        
        int sum = 0;
        
        int sumOfSecondCode = 0;
	
        boolean condition = true;
        
        while(condition) {
        
        System.out.println("enter card code");
        
        String card1 = in.next();
        
        for(int i = 1; i <= card1.length(); i = i + 2) {
        	
        	String digits1 = card1.substring(i, i + 1);
        	
        	firstSum = firstSum + Integer.parseInt(digits1);
        	
        	
        }
        
        for(int i = card1.length() - 1; i > 0; i-=2) {
        	
        	String digits = card1.substring(i - 1, i);
        	
        	nextCard =nextCard +  (2 * Integer.parseInt(digits));
        	}
        
        for(int i = 0; i < nextCard.length(); i++) {
        	
        	sumOfSecondCode = sumOfSecondCode + Integer.parseInt(nextCard.substring(i, i+1));
        	
        }
     
      
      
      sum = firstSum + sumOfSecondCode;
      
      if(sum % 10 == 0) {
    	  System.out.println("your card code is valid");
    	  
    	  condition = false;
      }else {
    	  System.out.println("your card code isn't valid;");
      }
        
        }
        
        
	}
}
