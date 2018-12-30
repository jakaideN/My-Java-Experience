package lesson14;

import java.util.ArrayList;

public interface Filter {

	boolean accept (Object x);

public static ArrayList<Object> collectAll(ArrayList<Object> objects , Filter f){
	
	ArrayList<Object> filterList = new ArrayList();
	
	for(Object o: objects) {
		
		if(f.accept(o)) {
			
			filterList.add(o);
		}
		
	}
	
	return filterList;
	
}
		
		
	
	
}
