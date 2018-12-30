package loops;

import java.util.Scanner;

public class P420 {
	
//public static void main(String args[]) {
		
//		Scanner in = new Scanner(System.in);
//
//		int number = in.nextInt();
//		
//		boolean condition = true;
//		
//		for(int i = 1; i <= number *((number * 2) + 1); i++) {
//			
//			System.out.print("*");
//			
//			if(i / number == 1 && i % number == 0) {
//				System.out.print(" ");
//			}
//	
////			if(i == (number * 2) ) {
////				System.out.print("\n");
////			}
//			
//			
//			if( i % 11 ==0) {
//				System.out.print("\n");
//			}
//			
//			
//			
//
//		}
//}
//}
//
	
	
//	public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int number = input.nextInt();
//        input.close();
//
//        for (int i = 0; i < number; i++) {
//            for (int j = 0; j < number * 2 + 1; j++) {
//                if (j == number || (i > 0 && i < number - 1 && j > number + 1 && j < number * 2)) {
//                    System.out.print(" ");
//                }
//                else {
//                    System.out.print("*");
//                }
//            }
//            System.out.println();
//        }
//    }
	
	
	
	public static void main(String args[]) {
		
		 Scanner in = new Scanner(System.in);
		 
		 int sl = in.nextInt();
		 
		 String line = null;
		 
		 for(int rows = 1; rows <= sl; rows++) {
			 
			line = ""; 
			 
			for(int col = 1; col <= sl *2; col++) {
				
				if(col == sl + 1) {
					line =line +  " ";
				}
				
				if(col >sl + 1 &&  col < sl*2 && (rows!=1 && rows!= sl)) {
					line =line +  " ";
				}else {
					line = line + "*";
				}
			}
			
			System.out.println(line);
			
		 }
		 
		 
		 
		 
		 
		
	}	
}