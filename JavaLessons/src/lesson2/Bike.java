package lesson2;

public class Bike {
	float height = 0.5f;
	float lenght = 1.80f;
	String color = "blue";
	int distance = 0;
	
	void setColor() {
		System.out.println("blue");
		
	}
	
	float getArea() {
		return lenght*height;
	}
	
	void setArea() {
		System.out.println(lenght*height);
	}
	
	void setSpeed() {
		System.out.println(distance+=10);
	}
	
	void getSpeed(int speed) {
		distance+=speed;
		System.out.println(distance);
	}
	
	
	}
