package game;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {

	public static void main (String args[]) {
		
		Scanner s = new Scanner(System.in);
		
		ArrayList<String> cumleler =new ArrayList<String>(); // burda cumleler olacaq
		
		cumleler.add("Bu oyun çox gözəl oyundur çox  bəyənirəm");
		
//		cumleler.add("Pianoda gözəl bir mahnı ifa edə bilərsən");
		
//		cumleler.add("Atı , onun istədiyi yönə sürmək asantdır");
		
//		cumleler.add("Səni, sadəcə  sən olduğun üçün sevirdim");
		
//		cumleler.add("Çölə bax,  günəş necədə gözəl parıldayır");
		
//		cumleler.add("Dollar daha nə qədər qalxacax,  bilmirəm");
		
		cumleler.add("Mən bu oyunu çox sevdim, maraqlı oyundur");
		
		// cumleler listi burda bitdi
		
		
		
		
		
		
		//oyunun haqqinda
		
		System.out.println("\t\t\tKlaviatura Yarışı");
		
		System.out.println("\nOyunda 40 karakterdən ibarət cumlələr olacaq. Kim ən sürətli cümləni düzgün yazıb bitirsə o qalib olur!");
		
		//oyun haqqinda burda bitir	
		
		
		
		
		
		
		// oyun baslangici
		
		System.out.print("Birinci oyunçunun adı:  ");
		
		String nameOfFirstPlayer = s.next(); //birinci oyuncu adi daxil edilir
		
		System.out.print("Ikinci oyunçunun adı:   ");
		
		String nameOfSecondPlayer = s.next(); //ikinci oyuncu adi daxil edilir
		
		//oyun baslangici burda bitir
		
		
		
		
		
		
		
		//BIRINCI oyuncunun hissesi
		double netice1 = 0;
		LocalTime timeForEnd = LocalTime.now();
		LocalTime timeStart = LocalTime.now();
		String ready ="";
		
		System.out.println("\t\t\tNÖVBƏ BİRİNCİ OYUNÇUDADIR");
		
		System.out.println("ready yazdıqda oyun başlıyacaq");
		
		boolean conditionForReady1 = false;
		
				while(!conditionForReady1) {
			
						ready = s.next();
			
							if(ready.equalsIgnoreCase("ready")) {
									conditionForReady1 = true;
								}else {
										System.out.println("Hələ ready ni düz yaza bilmirsən oyunu necə udassan :)");
									}
					}
		
		if(ready.equalsIgnoreCase("ready")) {
			System.out.println(timeStart);
			System.out.println("\n\n\t\t\tOYUN BAŞLADI");
			String tapsiriq1 = cumleler.get((int)(Math.random() * 2));
			
			System.out.println(tapsiriq1);
			
			String test = s.nextLine();     // ?? problem in line 64
			
			boolean condition = false;
			
			while(!condition) {
			
				String cavab1 = s.nextLine();
			
				if(cavab1.equals(tapsiriq1)) {
					condition = true;
				}else {
					System.out.println("bir daha cəhd edin :)");
				}
			
				if(cavab1.equals(tapsiriq1)) {
					timeForEnd = LocalTime.now();
					System.out.println(timeForEnd);
					System.out.println("\n\t\t\tCavabınız düzgündür");	
				}
				
				}
			
			int startTimeConverting = 0;
			startTimeConverting = startTimeConverting  + (timeStart.getMinute() * 60) + timeStart.getSecond();
			
			int endTimeConverting = 0;
			endTimeConverting = endTimeConverting + (timeForEnd.getMinute() * 60) + timeForEnd.getSecond();
			
			netice1 = endTimeConverting - startTimeConverting;
//			 netice1 = timeForEnd.getSecond() - timeStart.getSecond();
//		
//			if(netice1 < 0) {
//				netice1 = 60 + netice1;
//			}
//			if(timeForEnd.getMinute() > timeStart.getMinute()) {
//				netice1 = netice1 + (((timeForEnd.getMinute() - timeStart.getMinute()) * 60) - 60);
//			}
//			if((timeForEnd.getMinute() - timeStart.getMinute()) > 1){
//				netice1 = netice1 - 60;
//			}
		
			System.out.println("\n\n\t\t\tNetice:" + (int)netice1 + " saniyə");
		}
			//BIRINCI oyuncunun hissesi burda bitir
			
			
			
			
			
			
			
			
			//IKINCI oyuncunun hissesi
			double netice2 = 0;
			LocalTime timeForEnd2 = LocalTime.now();
			LocalTime timeStart2 = LocalTime.now();
			String ready2 ="";
				
			System.out.println("\n\n\n\n\t\t\tNÖVBƏ İKİNCİ OYUNÇUDADIR");
			
			System.out.println("ready yazdıqda oyun başlıyacaq");
			
			boolean conditionForReady2 = false;
			
			while(!conditionForReady2) {
		
					ready2 = s.next();
		
						if(ready2.equalsIgnoreCase("ready")) {
								conditionForReady2 = true;
							}else {
									System.out.println("Hələ ready ni düz yaza bilmirsən oyunu necə udassan :)");
								}
				}
			
			if(ready2.equalsIgnoreCase("ready")) {
			System.out.println(timeStart2);
			
			System.out.println("\n\n\t\t\tOYUN BAŞLADI");
			
			String tapsiriq2 = cumleler.get((int)(Math.random() * 2));
			
			System.out.println(tapsiriq2);
			
			String test2 = s.nextLine();
			
			boolean condition2 = false;
			
				while(!condition2) {
				
					String cavab2 = s.nextLine();
				
					if(cavab2.equals(tapsiriq2)) {
						condition2 = true;
						}else {
							System.out.println("bir daha cəhd edin :)");
						}
					
					if(cavab2.equals(tapsiriq2)) {
						timeForEnd2 = LocalTime.now();
						System.out.println(timeForEnd2);
						System.out.println("Cavabınız düzgündür");	
						}	
				}
				
				int startTimeConverting2 = 0;
				startTimeConverting2 = startTimeConverting2 + (timeStart2.getMinute() * 60) + timeStart2.getSecond();
				
				int endTimeConverting2 = 0;
				endTimeConverting2 = endTimeConverting2 + (timeForEnd2.getMinute() * 60) + timeForEnd2.getSecond();
				
				netice2 = endTimeConverting2 - startTimeConverting2;
				
				
//				 netice2 = timeForEnd2.getSecond() - timeStart2.getSecond();
//				
//				if(netice2 < 0) {
//					netice2 = 60 + netice2;
//				}if(timeForEnd2.getMinute() > timeStart2.getMinute()) {
//					netice2 = netice2 + (((timeForEnd2.getMinute() - timeStart2.getMinute()) * 60) - 60);
//				}
//////				if((timeForEnd2.getMinute() - timeStart2.getMinute()) > 1){
////					netice2 = netice2 - 60;
////				}
			
				System.out.println("\n\nNetice:" + (int)netice2 + " saniyə");
			}
			//IKINCI oyuncunun hissesi burda bitir
		
		
			if(netice1 > netice2) {
				System.out.println("\t\t\t" + nameOfSecondPlayer + " qazandı");
			}else if(netice1 < netice2) {
				System.out.println("\t\t\t" + nameOfFirstPlayer + " qazandı");
			}else if(netice1 == netice2) {
				System.out.println("\t\t\tBərabərə");
			}
			
		
	
			
			
			
			
			
	}
}
