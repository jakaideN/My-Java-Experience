package lesson6;

public class Car {
	
	private String name;
	
	private String brand;
	
	private int cost;
	
	private int maximumSpeed;
	
	private int count;
	
	public Car() {
		System.out.println("Creating empty object");
	};

	public Car(String brand) {
		this();
		this.brand = brand;
		System.out.println("Setting car brand");
		
	};
	
	public Car(String name , String brand , int cost , int maximumSpeed , int count) {
		
		this(brand);

		
		this.name = name;
		
		
		this.cost = cost;
		
		this.maximumSpeed = maximumSpeed;
		
		this.count = count;
		
		System.out.println("Setting all fields");
		
	}
	
	
	public String getBrand() {
		return brand;
	}
	
	public int getCost() {
		return cost;
	}
	
	public int getCount() {
		return count;
	}
	
	public int getMaximumSpeed() {
		return maximumSpeed;
	}
	
	
	public String getName() {
		return name;
	} 
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void setCost(int cost) {
		this.cost = cost;
	}
	
	public void setCount(int count) {
		this.count = count;
	}
	
	public void setMaximumSpeed(int maximumSpeed) {
		this.maximumSpeed = maximumSpeed;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}

	
