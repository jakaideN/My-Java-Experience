package Tekrar1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayProblem {

	public static void main(String args[]) {
		
		int sum = 0;
		
		int sumPrev = 34;
		
		int sumRow = 0;
		
		int sumDiog1 = 0;
		
		int sumDiog2 = 0;
		
		
		Scanner s = new Scanner(System.in);
		
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println();
		
		boolean cond = false;
		
		Cavid: while(!cond) {
		
			for(int i = 0; i < 16; i++) {
				int num = s.nextInt();
				
				list.add(num);
			}
	
			
			for(int j = 0; j < 16; j++) {
				
				sum = sum + list.get(j);
				
				if((j+1) % 4 == 0) {
					if(sum != sumPrev) {
						System.out.println("Siz sehirli kavadrati duzgun daxil etmediniz, reqemlerin cemi eyni deyil");
						break Cavid;
					}else {
						sumPrev = sum;
						sum = 0;
					}
				}
			}
			
			
			for(int i = 0; i < 4; i ++) {
				
				for(int j = 0; j < 16; j+=4) {
					
					sumRow = sumRow + list.get(i+j);
				}
				if(sumRow !=sumPrev) {
					System.out.println("Siz sehirli kavadrati duzgun daxil etmediniz, reqemlerin cemi eyni deyil");
					break Cavid;
				}else {
					sumRow = 0;
				}
			}
			
			for(int i = 3; i < 13; i +=3) {
				sumDiog1 = sumDiog1 + list.get(i);
			}
			if(sumDiog1 != 34) {
				System.out.println("Siz sehirli kavadrati duzgun daxil etmediniz, reqemlerin cemi eyni deyil");
				break Cavid;
			}
			
			
			for(int i = 0; i < 16; i +=5) {
				sumDiog2 = sumDiog2 + list.get(i);
			}
			if(sumDiog2 != 34) {
				System.out.println("Siz sehirli kavadrati duzgun daxil etmediniz, reqemlerin cemi eyni deyil");
				break Cavid;
			}else {
				System.out.println("Tebrikler siz magic square qurdunuz!\n\n\n");
				break Cavid;
			}
	}
		

		
		
		
		System.out.println("\tYazdiqiniz 4*4 kvadrat");
		
		for(int i = 0; i < 16; i++) {
			if(i % 4 == 0) {
				System.out.println();
			}
			
			System.out.print("\t" + list.get(i) + "  ");
		}
	
		
		
		
		
		
		
		
	}
}
