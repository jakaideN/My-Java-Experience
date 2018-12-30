package lesson9;
import java.util.Scanner;

public class Console {
	
	Scanner s = new Scanner(System.in);
	
	public void start() {
				
	System.out.println("Mark initial position");
	
	int initialPosition = s.nextInt();
		
	Bug bugsy = new Bug(initialPosition);
	
	boolean  condition = true;
	
	while(condition) {//BUNU WHILE ILE YAZ
	
	System.out.println("enter command");

	String command = s.next();
	
	if(command.equalsIgnoreCase("exit")) {
	condition = false;
	
	}
	
	else if(command.equalsIgnoreCase("move")) {
		
		bugsy.move();
		System.out.println(bugsy.getPosition());
		
	}
			
	else if(command.equalsIgnoreCase("turn")) {
		
		bugsy.turn();
		System.out.println(bugsy.getDirection());
		System.out.println(bugsy.getPosition());

	}
	
	else if (command.equalsIgnoreCase("getposition")) {
		
		bugsy.getPosition();
	}
			
	
	
	

}
	System.out.println("This program end");
}
}