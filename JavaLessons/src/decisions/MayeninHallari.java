package decisions;

import java.util.Scanner;

import javax.management.relation.Relation;

public class MayeninHallari {
	public static void main(String args[]) {

		double meter = 0;

		Scanner s = new Scanner(System.in);

		double boilingPoint = 100;
		
		try {
		
		System.out.println("Enter a meter");

		meter = s.nextInt();
		
		}catch(Exception e) {
		
			System.out.println("Dogru deyer daxil edilmemisdir");
			System.exit(0);
		}
		
		if(meter >= 300) {
			boilingPoint = boilingPoint - meter / 300;
		}

		System.out.println("Enter degree");

		String degree = s.next();
		try {
		throw new Exception("Simple Exception");
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println(e);
		}
		Double realDegree = Double.parseDouble(degree.substring(0, degree.length() - 1));

		String unit = degree.substring(degree.length() - 1);
		
		if(unit.equalsIgnoreCase("f")) {
		
			realDegree =( realDegree - 32 )/ 1.8;// Converting f to c
			
		}
		
		if(realDegree >= boilingPoint) {
			System.out.println("Gas");
		}else if ( realDegree <= 0) {
			System.out.println("Solid");
		}else {
			System.out.println("Liquid");
		}
		
		
		

	}
}
