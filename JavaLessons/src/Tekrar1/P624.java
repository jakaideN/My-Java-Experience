package Tekrar1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class P624 {

	private static boolean cond = false;

	private static boolean cond2 = false;
	
	private static boolean cond3 = false;

	private static String sira = "";

	private static String cerge = "";

	private static int intSira = 0;

	private static int intCerge = 0;

	private static String answer2 = "";

	public static void main(String args[]) {
		
		Scanner s = new Scanner(System.in);
		
		int[][] seats = {
				{10, 10, 10, 10, 10, 10, 10, 10, 10, 10},
				{10, 10, 10, 10, 10, 10, 10, 10, 10, 10},
				{10, 10, 10, 10, 10, 10, 10, 10, 10, 10},
				{10, 10, 20, 20, 20, 20, 20, 20, 10, 10},
				{10, 10, 20, 20, 20, 20, 20, 20, 10, 10},
				{10, 10, 20, 20, 20, 20, 20, 20, 10, 10},
				{20, 20, 30, 30, 40, 40, 30, 30, 20, 20},
				{20, 30, 30, 40, 50, 50, 40, 30, 30, 20},
				{30, 40, 50, 50, 50, 50, 50, 50, 40, 30},
				};
	
		
		int[][] doluYerler = new int[9][10];
	
		
		
	try {
		Bir: while(!cond) {
			
			System.out.println("Bileti necə almaq isdəyirsiniz? "
					+ "\n\n\n1)sıra ve cərgəni seçərək "
					+ "\n\n\n2)xüsusi qiymətə bütün mümkün cərgələri baxıb sonra seçərək?"
					+ "\n\n\nSeçmək ücün 1 vəya 2 ə basın"); 
			
			String answer = s.nextLine();
				
			
			
			
			if(answer.equals("1")) {
				Iki: while(!cond2) {
					System.out.println("Isdədiyiniz sıranın nömrəsini daxil edin. Əgər geriyə dönmək isdəyirsinizsə \"geri\" yazin");
					
					sira = s.nextLine();
					
					
					
					if(sira.equalsIgnoreCase("geri")) {
						continue Bir;
					}
					
					System.out.println("Isdədiyiniz cərgənin nömrəsini daxil edin");
					
					cerge = s.nextLine();
					
					intCerge = Integer.parseInt(cerge);
					
					intSira = Integer.parseInt(sira);				
					
					if(intSira >= 10 || intCerge >=11) {
						System.out.println("sıra ve cərgə sayı (uygun olaraq) maximum 9 ve 10");
					}
					else if(doluYerler[intSira-1][intCerge-1] != seats[intSira-1][intCerge-1]) {
						System.out.println("Qiyməti:" + seats[intSira - 1][intCerge - 1] + "manat");
					}else {
						System.out.println("Bu yer alinmisdir");
					}
					
					doluYerler[intSira-1][intCerge-1] = seats[intSira-1][intCerge-1];
					
					
				}
			}else if(answer.equals("2")) {
				
				Uc:	while(!cond3) {
					System.out.println("Mümkün qiymətlər 10, 20, 30, 40, 50. Əgər geriyə dönmək isdəyirsinizsə \"geri\" yazın"
							+ "\n\nIsdədiyiniz qiyməti secin: ");
					
					answer2 = s.nextLine();
					
					boolean numeric = true;

			        try {
			            Double num = Double.parseDouble(answer2);
			        } catch (NumberFormatException e) {
			            numeric = false;
			        }
			        
			        if(numeric) {
			        	
						if(Integer.parseInt(answer2) ==10 ||
							Integer.parseInt(answer2) ==20 ||
							Integer.parseInt(answer2) ==30 ||
							Integer.parseInt(answer2) ==40 ||
							Integer.parseInt(answer2) ==50 ) 
							{
						
							System.out.println("Mümkün yerlər:");
							for(int i = 0, k = 0; i <seats.length; i++) {
																
								for(int j = 0 ; j < seats[i].length; j++ ) {
									
									if(seats[i][j] == Integer.parseInt(answer2)) {
										System.out.println(k + ") Sıra: " + (i+1) + "  Cərgə: " + (j+1));
										k++;
									}
								}
							}
							
							System.out.println("Hansı cərgə və sıranı seçirsiniz?");
							
							System.out.print("Sıra: ");
							sira = s.nextLine();
							
							System.out.print("Cərgə: ");
							cerge = s.nextLine();
							
							
							intCerge = Integer.parseInt(cerge);
							
							intSira = Integer.parseInt(sira);				
							
							
							
							if(intSira >= 10 || intCerge >=11) {
								System.out.println("sira ve cerge sayi (uygun olaraq) maximum 9 ve 10");
							}
							
							else if(doluYerler[intSira-1][intCerge-1] != seats[intSira-1][intCerge-1]) {
								System.out.println("Qiyməti:" + seats[intSira - 1][intCerge - 1] + "manat");
							}else {
								System.out.println("Bu yer alinmisdir");
							}
							
							doluYerler[intSira-1][intCerge-1] = seats[intSira-1][intCerge-1];
							
							continue Bir;
							
							
							}else{
								
								System.out.println("Mümkün qiymətlərdən kənar yazmayin!");
							}
			        }

					
					if(answer2.equalsIgnoreCase("geri")) {
						
						continue Bir;
					
					} 
				}
					
				
				
				
				
				
				
			}else {
				System.out.println("\n\nAncaq 1 ve 2 yaza bilersiniz!!!\n\n");
			}
			
			
			
				
		}
	} catch (Exception e) {
		
	}
		
		
		
		
			
	}
}
