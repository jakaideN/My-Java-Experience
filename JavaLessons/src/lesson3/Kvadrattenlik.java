package lesson3;

public class Kvadrattenlik {
	
	
	double find(double x , double h , double y , double k) {
		
		return Math.sqrt((x - h * h) + (y - k * k));
	}
	

	double tap(double l , double b , double  c , double a) {
		
		return  (-b + Math.sqrt(b * b - 4 * a * c)) / 2 * a;
	}
	
	double choose(double g , double n , double m  ) {
		 
		return Math.pow(g , n) * Math.pow(g , m);
	}
	
	public double hesabla(double f , double p , double l) {
		
		return Math.pow(f , p) / Math.pow(f , l); 
	}
	
	
	double write(double q , double r) {
		
		return  Math.pow(q , r);
		
	}
	
	
	double calculate(double j , double k , double o) {
		
		return  Math.pow(Math.pow(j , k) , o);
	}
}
