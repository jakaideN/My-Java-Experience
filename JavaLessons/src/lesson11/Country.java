package lesson11;

import java.util.Scanner;

import java.util.*;

 public class Country {

	private double area;

	private String name;

	private int population;

	public double getArea() {
		return area;
	}

	public String getName() {
		return name;
	}

	public int getPopulation() {
		return population;
	}

	public Country(String name, double area, int population) {

		this.name = name;

		this.area = area;

		this.population = population;

	}

	public static void main(String args[]) {

		ArrayList<Country> countryList = new ArrayList();

		Scanner s = new Scanner(System.in);

		double area = 0;

		String name = null;

		int population = 0;

		boolean condition = true;

		while (condition) {

			System.out.println("Enter command: ");

			String answer = s.next();

			if (answer.equalsIgnoreCase("add")) {
				boolean nameEntered = false;

				while (!nameEntered) {
					System.out.println("enter country name");
					name = s.next();
					if (name != null && !name.trim().equals("")) {
						nameEntered = true;
					}
				}

				boolean populationEntered = false;

				while (!populationEntered) {
					System.out.println("enter populatin of country");
					String popStr = s.next();
					try {
						population = Integer.parseInt(popStr);
						populationEntered = true;
					} catch (NumberFormatException e) {
						System.out.println("Population only accepts digits");
					}
				}

				boolean areaEntered = false;

				while (!areaEntered) {

					System.out.println("enter area of country");
					String areaStr = s.next();
					try {
						area = Double.parseDouble(areaStr);
						areaEntered = true;
					} catch (Exception e) {

						System.out.println("area only accepts number");
					}
				}

				Country country = new Country(name, area, population);

				countryList.add(country);

				System.out.println("Country added");

			} else if (answer.equalsIgnoreCase("exit")) {

				System.out.println("EXITING.");

				condition = false;
			}

		}
		
		
		int cem = countryList.size();

		System.out.println(cem + " country(s) added");
		
		Country cwlarea = countryList.get(0);
		Country cwlpop = countryList.get(0);
		Country cwlpopDensity = countryList.get(0);
		
		
		
		for (int i = 0; i < countryList.size(); i++) {
			Country c = countryList.get(i);
			double popDensity = c.getArea()/c.getPopulation();

			if (cwlpop.population < c.population) {

				cwlpop = c;

			}

			if (cwlarea.area < c.area) {

				cwlarea = c;

			}
			
			if(cwlpopDensity.getArea()/cwlpopDensity.getPopulation() < popDensity) {
				
				cwlpopDensity = c;
			}
		}

		System.out.println("Summary: ");
		
		System.out.printf("Country with the Largest area:\t\t\t%s %f \nCountry with Largest population:\t\t%s %d \nCountry with the Largest population density:\t%s %f", cwlarea.getName()  , cwlarea.getArea() , cwlpop.getName(),  cwlpop.getPopulation() ,cwlpopDensity.getName(), cwlpopDensity.getPopulation()/cwlpopDensity.getArea());
		
		
		
		
	}
}