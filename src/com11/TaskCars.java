package com11;

public class TaskCars {

	public static void main(String[] args) {
	/*Create an array of cars : american, german, korean, italian.
	 *  Then retrieve all values from that array
	 *  
	 *  Create an array of countries: north america countries,
	 *   south america countries, europe countries, asian countries,
	 *    african countries. Then print all values from that array.
	 */

		
		String  car[][]= {{"Chevrolet","Ford Mustang","Tesla"},
				          {"Audi","BMW","Porsche","Mercedes"},
				          {"Kia","Hyundai"},
				          {"Ferrari","Alfa Romeo"} };
	for(int i=0; i<car.length; i++) { 
		
		for(int j=0; j<car[i].length; j++) {
			System.out.print(car[i][j] +" ");
			
		}
		System.out.println();
	}
		System.out.println("----------");
		
		String countries[][]= {{"USA","Canada","Mexico","Cuba"},
				               {"Germany","Italiy","France"},
				               {"China","India","Indonesia"},
				               {"Egypt","Nigeria","Ghana","Tanzania"}
		};
		
		
		for(int a=0; a<countries.length; a++) {
			for(int b= 0; b<countries[a].length;  b++) {
				System.out.print(countries[a][b]+" ");
			}
			System.out.println();
		}
		
		
	
		
	
		
		
		
		
		
	
	}
}
