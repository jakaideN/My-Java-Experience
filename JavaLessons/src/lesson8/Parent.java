package lesson8;

public class Parent {
	
	public String s = "Hello";
	
	public void print() {
		
		System.out.println("It is Parent");
		
	}
}

class Child extends Parent{
	
	 String s = "Hello Child"; // Variable hiding
	
	public void printChild() { //OVERRIDE
		
		System.out.println("child");
		
	}
	
	
	public static void main(String args[]) {
		
		Child child = new Child();
		
		child.printChild();
		
		child.print();		
	}
	
}