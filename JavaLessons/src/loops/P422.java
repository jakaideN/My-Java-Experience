package loops;

import java.util.Scanner;

import java.util.Random;

public class P422 {
	
	public static void main(String[] args) {
      
		Scanner in = new Scanner(System.in);
     
		boolean condition = true;
		
		int pileSize = 0;
		
		int computerTurn = 0;
		
		int humanTurn = 0;
		
		boolean smart = true;
		
//		double enoughSize = Math.pow(2,(int)(Math.random() * 4) + 2);
//		System.out.println(enoughSize);
		
//		System.out.println((int)(Math.random() * 4) + 2);
		
		boolean stupidComp = true;
		
		while(condition) {

		 pileSize = (int) (Math.random() * 100) ;
		
			if(pileSize >= 10 && pileSize <=100) {
				condition = false;
			}
		}
        
		System.out.println("pile size  " + pileSize);
		
		int humanOrcompStart =(int) (Math.random() * 2);
		
		int smartOrStupid =(int) (Math.random() * 2);
		
		if(humanOrcompStart == 0) {
			System.out.println("your choice ");
		}else {
			System.out.println("computer choice");
		}
		
		if(smartOrStupid == 0) {
			System.out.println("mode: smart");
		}else {
			System.out.println("mode: stupid");
		}
		

        
        while(pileSize > 0) {
        	
        	//if the computer is stupid
        	if(smartOrStupid == 1) {
        		//if computer start in stupid mode
        		if(humanOrcompStart == 1) {
        			
        			// komputer gedisinin secimi
        			
        		
        		computerTurn =(int) (Math.random() * pileSize / 2) + 1;
    
        		System.out.println("computer choice  " + computerTurn);

        		
        		pileSize = pileSize - computerTurn;
        		
                System.out.println("left   " + pileSize);
                
                humanOrcompStart = 0;
                
                stupidComp = true;
                
                
                //if human start in stupid mode
        	}else {
        		humanTurn = in.nextInt();
        		
        		pileSize = pileSize - humanTurn;
        		
                System.out.println("left " + pileSize);
                
                humanOrcompStart = 1;
                
                stupidComp = true;
        	}
        		
        		
        		 //if the computer is smart
        }else {
        	
        	
        	//if computer start in smart mode
        	if(humanOrcompStart == 1) {
            	
        			if(pileSize == 3 || pileSize == 7|| pileSize == 15 || pileSize == 31 || pileSize == 63) {
    					computerTurn = (int) (Math.random() * pileSize / 2) + 1;
    					System.out.println("equals");
    				}
    				else if(pileSize > 63) {
    					computerTurn = pileSize - 63;
    					System.out.println(">63");
    				}else if(pileSize > 31) {
    					computerTurn = pileSize - 31;
    					System.out.println(">31");
    				}else if(pileSize > 15) {
    					computerTurn = pileSize - 15;
    					System.out.println(">15");
    				}else if(pileSize > 7) {
    					computerTurn = pileSize - 7;
    					System.out.println(">7");
    				}else if (pileSize > 3){
    					computerTurn = pileSize - 3;
    					System.out.println(">3");
    				}else {
    					computerTurn = 1;
    					System.out.println("1");
    				}
    				
    	
            System.out.println("Computer choice " + computerTurn);

    		
    		pileSize = pileSize - computerTurn;
    		
            System.out.println("left " + pileSize);
            
            humanOrcompStart = 0;
            
            
            // if human start in smart mode
    	}else {
    		humanTurn = in.nextInt();
    		
    		pileSize = pileSize - humanTurn;
    		
            System.out.println(pileSize);
            
            humanOrcompStart = 1;

    	}
       }
     }
 

        
       
        
        
        
        
    }
}
