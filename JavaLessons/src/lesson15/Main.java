package lesson15;
import java.util.ArrayList;
import java.util.Scanner;
import lesson14.Filter;
import lesson14.ShortWordFilter;
public class Main {
	
	public static void main(String args[]) {
		
		ArrayList<Object> carList = new ArrayList<>();
			
		carList.add(new Car("a", 1995));
		
		carList.add(new Car("b", 1996));
		
		carList.add(new Car("c", 1997));
		
		carList.add(new Car("d", 1998));
		
		carList.add(new Car("f", 1999));
		
		carList.add(new Car("g", 2000));

		carList.add(new Car("h", 2001));
		
		carList.add(new Car("j", 2002));
		
		carList.add(new Car("k", 2003));

		carList.add(new Car("l", 2004));

		ArrayList<Object> oldCar = Filter.collectAll(carList, new OldCarFilter());
		
		ArrayList<Object> newCar = Filter.collectAll(carList, new NewCarFilter());
		
		System.out.println("old cars:");
		for (int i = 0; i < oldCar.size(); i++) {

			System.out.println(oldCar.get(i));

		}
	
		System.out.println("new cars:");
		for (int i = 0; i < newCar.size(); i++) {

			System.out.println(newCar.get(i));

		}
	
	
		
		
	}
	

}
