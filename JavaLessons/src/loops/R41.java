package loops;
import java.util.Scanner;
public class R41 {

	public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in);
//		
//		int number = in.nextInt();
//		
//		// R4.1 B) start
//		int i = 0;
//		while(i < number){
//			
//			if(i % 10 == 0 && i !=0) {
//				System.out.print(i + " ");
//			}
//			i++;
//		}
//		//R4.1 B) end
//		
//		//R4.1 C) start
//		int first = 1;
//		while(first < number) {
//		System.out.print(first + " ");
//		first = first * 2;
//		}
//		//R4.1 C) end
//		
//		//R4.2 A) start
//		for(int i = 2; i <=100; i+=2) {
//			System.out.println(i);
//		}
//		//R4.2 A) end
//		
//		//R4.2 B) start
//		for(int i = 1; i <= 100; i++) {
//				System.out.println(Math.pow(i, 2));
//		}
//		//R4.2 B) end
//		
////		R4.2 C) start
//		int a = in.nextInt();
//		int b = in.nextInt();
//		for(; a<=b; a++) {
//			if(a % 2 != 0) {
//				System.out.println(a);
//			}
//		}
////		R4.2 C) end
//		
////		R4.2 D) start
		String n = in.nextLine();
		int partPrevious = 0;
		int part = 0;
		for(int i = 1; i <=n.length(); i++) {
			String subs = n.substring(i-1,i);
			if(Integer.parseInt(subs) % 2 != 0) {
				part = Integer.parseInt(subs);
				part = part + partPrevious;
				partPrevious = part;
			}
		}
		System.out.println(part);
//		//R4.2 D) end
		
		
		
		
		
		
	}
	
}
