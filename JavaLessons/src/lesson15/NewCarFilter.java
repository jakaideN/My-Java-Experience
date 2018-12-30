package lesson15;
import lesson14.Filter;
public class NewCarFilter implements Filter{

public boolean accept(Object x) {
		
		Car car = (Car) x;
		
		if(car.getYear() > 2000) {
			
			return true;
		}return false;
		
	}

	
}
