package decisions;
import java.util.Scanner;
public class VideoClub {

	public static void main(String args[]) {
		
		Scanner s = new Scanner(System.in);
	
		System.out.println("Enter the number of video games");
		
		int numberOfMovies = s.nextInt();
		
		System.out.println("Enter the number members referred to the video club:");
		
		int members = s.nextInt();
		
		double discount = Math.min(numberOfMovies + members, 75);
		
		System.out.println("Discount is equal to: " + discount + " percent");

		
		
		
	
}
}