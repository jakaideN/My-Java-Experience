package lesson9;

public class Bug {
	
	private int unit = 1;
	private int position;
		
	public Bug(int initialPosition) {
		this.position = initialPosition;
	}
	
	public void turn() {
		
	unit = -unit;
		
	}
	
	public void move() {
		
		position += unit;
	}
	
	
	public int getPosition() {
		
		return position;
	}
	
	public String getDirection() {
		if(unit==1) {
			return "rigth";
		}else
			return "left";
	}
	
}
