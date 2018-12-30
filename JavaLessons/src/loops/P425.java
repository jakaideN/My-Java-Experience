package loops;
import java.util.Scanner;

public class P425 {

	public static void main(String[] args) {
        final int a = 32310901;
        final int b = 1729;
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Please enter a seed: ");
        int seed = in.nextInt();
        
        int oldValue = 0;
        
        int newValue = 0;
        
        oldValue = seed;

        for (int i = 0; i < 100; i++) {
        	newValue = (a * oldValue + b);
            
        	oldValue = newValue;
            
        	System.out.println(newValue);
        }
    }
	
}
