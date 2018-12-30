package lesson7;

public class Car {
	
	private double fuelEfficiency;
	
	double amountOfFuel = 0;
	
	public Car(double fuelEfficienty) {
		
		this.fuelEfficiency = fuelEfficienty;
		
	}
	
	public void addGas(int x) {
		
		amountOfFuel += x;
		
	}
	
	public void drive(int y) {
		
		double spent = y / fuelEfficiency;
		
		amountOfFuel -= spent;
	}
	
	public double getGasLevel() {
		
		return amountOfFuel;
		
	}

	
	
}
