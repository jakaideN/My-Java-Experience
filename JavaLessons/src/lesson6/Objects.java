package lesson6;

public class Objects {
	
	
	public static int count = 0;
	
	public String name = "Gadir";
	
	
	
public void addCount(int c) {
		
		count+= c;
	}
	
public void printCount(){
		
		System.out.println(count);
	}
	

	
	public static void printStaticCount() {
		System.out.println(count);
		
	//	System.out.println(name);
		
		
		
	}
	

	public void main(String args[]) {
			System.out.println(name);
		
	}
	
	

}
