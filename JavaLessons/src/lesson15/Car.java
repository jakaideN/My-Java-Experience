package lesson15;

public class Car {

	private String brand;

	private int year;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public Car(String brand, int year) {
		
		this.brand = brand;
		this.year = year;
	}
	
public String toString() {
		
		String s = "brand: " + brand + " year: " + year;
		
		return s;
	}
}
