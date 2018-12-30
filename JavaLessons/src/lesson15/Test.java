package lesson15;
import java.util.Scanner;
import java.util.ArrayList;
public class Test {

	public static void main(String args[]) {
		
	Scanner s = new Scanner(System.in);	
		
	System.out.println("Write integer");
	
	int number = s.nextInt();
	
	ArrayList <Integer> list = new ArrayList();
	
	while(number/10 !=0 || number%10 != 0) {
		
		int i = number%10;
		
		list.add(i);
		
		number = number/10;
//		System.out.println(number);
	}
	
	for (int i = list.size()-1; i >= 0; i--) {
		
		System.out.print(list.get(i) + " ");
		
	}
	
	
	
	
	
	
	}
	
}
