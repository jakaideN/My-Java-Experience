package lesson7;

public class Program {
	
	public static void main (String args[]) {
//		
//		Address c1 = new Address(5 , "Cavid"  , 46 , "Baku" , "Abseron" , 1122);
//		
//		Address c2 = new Address(5 , "Cavid"  , "Baku" , "Abseron" , 1172);
//		
//		c1.print();
//		
//		System.out.println(c1.comesBefore(c2));
//		
//		
//		SodaCan s1 = new SodaCan(4 , 7);
//		
//		SodaCan s2 = new SodaCan(13 , 9);
//		
//		double s = s1.getSurfaceArea();
//		
//		System.out.println(s);
//		
//		
		
		Car myCar = new Car(10);
		
		myCar.addGas(10);
		
		myCar.drive(10);
		
		System.out.println(myCar.getGasLevel());
		
		
	}

}
