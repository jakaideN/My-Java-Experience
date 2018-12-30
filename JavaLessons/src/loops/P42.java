package loops;
import java.util.Scanner;
public class P42 {
	public static void main(String args[]) {
	
		Scanner in = new Scanner(System.in);
		
		int numberOfEvens = 0;
		
		int numberOfOdd = 0;
		
		int smallest = 1;
		
		int largest = 0;
		
		String cumulativeSum = "";
		
		int sum = 0;
		
		int previous = 0;
		
		String dublicates = "";
		
		boolean x = false;
		
		
		while(in.hasNextInt()) {
		
			int anyNumber = in.nextInt();
			
			if(anyNumber < smallest) {
				smallest = anyNumber;
			}
			if(anyNumber > largest) {
				largest = anyNumber;
			}
			
			if(anyNumber % 2 == 0) {
				numberOfEvens++;
			}else {
				numberOfOdd++;
			}
			
			sum = sum + anyNumber;
			
			cumulativeSum  = cumulativeSum +( sum + "");
			
			if(previous == anyNumber && x == false){
				dublicates = dublicates + previous + "";
				x = true;
			}
			
			previous = anyNumber;
			
	}
		System.out.println("dublicates" + dublicates);
		System.out.println("cumulativeSum :" + cumulativeSum);
		System.out.println("the largest number" + largest);
		System.out.println("the smallest number" + smallest);
		System.out.println("number of even number" + numberOfEvens);
		System.out.println("number of odd number" + numberOfOdd);
	
}
}