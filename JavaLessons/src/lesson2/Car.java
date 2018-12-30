package lesson2;

class Car {
	private int enginesize = 3000;
	private short height = 150;
	private short lenght = 300;
	private String color = "black";
	private int mileage = 0;
	void printColor() {
	System.out.println(color);
	
	
	}
	
	
	public void setColor(String newColor) {
		
	color = newColor;
	}
	
	public String getColor() {
		return color;
		
		
	}
	
	public short getLenght( ) {
		return lenght;
		
	}
	
	
	private void drive(int mile) {
		mileage += mile;
	}
	
	public void move() {
		drive(10);
	}
	
	public int getMileage() {
		return mileage;

		
	}
}

