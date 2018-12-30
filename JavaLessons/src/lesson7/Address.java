package lesson7;

public class Address {

	private int houseNumber;

	private String street;

	private int apartmentNumber;

	private String city;

	private String state;

	private int postalCode;

	public Address(int houseNumber, String street, int apartmentNumber, String city, String state, int postalCode) {

		this(houseNumber, street, city, state, postalCode);
		this.apartmentNumber = apartmentNumber;

	}

	public Address(int houseNumber, String street, String city, String state, int postalCode) {

		this.houseNumber = houseNumber;

		this.street = street;

		this.city = city;

		this.state = state;

		this.postalCode = postalCode;

	}
	
	
	public void print() {
		
		System.out.printf("%s\n%s %s %d\n", street , city, state , postalCode);	
		
		
		
	}
	
	
	public boolean comesBefore(Address other) {
		
		if(postalCode < other.postalCode) {
			return true;
		}
		
		return false;
		
	}
	

}
