package loops;

import java.util.Scanner;

public class P421 {

	public static void main(String[] args) {
		        Scanner in = new Scanner(System.in);
//		        int number = input.nextInt();
//		        input.close();
//		
//		        for (int i = 0; i < number - 1; i++) {
//		            for (int j = 0; j < number * 2 - 1; j++) {
//		                if ((j < number - 1 && i + j < number - 1) || (j > number - 1 && j - i >= number)) {
//		                    System.out.print(" ");
//		                }
//		                else {
//		                    System.out.print("*");
//		                }
//		            }
//		            System.out.println();
//		        }
//		
//		        for (int i = 0; i < number * 2 - 1; i++) {
//		            System.out.print("*");
//		        }
//		        System.out.println();
//		
//		        for (int i = number; i < number * 2 - 1; i++) {
//		            for (int j = 0; j < number * 2 - 1; j++) {
//		                if ((j == number - 1) || (j < number - 1 && i - j < number) ||
//		                    (j > number - 1 && i + j < number * 2 + (number - 2))) {
//		                    System.out.print("*");
//		                }
//		                else {
//		                    System.out.print(" ");
//		                }
//		            }
//		            System.out.println();
//		        }

	
	int n = in.nextInt();
	
	int sl = (n*2) - 1;
	
	int start = (sl/2) + 1;
	int end = start;
	
	for(int row = 1; row <= sl; row++) {
		
		String line = "";
		
		
		for(int col = 1; col <= sl; col++) {
			
			if(col >= start && col <= end) {
				line = line + "*";
			}else {
				line = line  + " ";
			}
		}
		
		if(row <= (sl/2)) {
			start --;
			end ++;
		}else {
			start++;
			end--;
		}
		
		System.out.println(line);

	}
	
	
		        	
	
		        
		        
		        
	}	
}
