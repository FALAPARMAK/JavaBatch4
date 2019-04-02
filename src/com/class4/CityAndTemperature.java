package com.class4;

import java.util.Scanner;

public class CityAndTemperature {

	public static void main(String[] args) {
		// Ask user to enter city and temperature in Fahrenheit
		// Your program should convert F- - > C
		// Your program should say "Temperature in the city -- is ---"

		//string
	
		
		

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your city");
		String cityName = scan.nextLine();

		System.out.println("Please enter temperature in Fahrenheit");

		int temp = scan.nextInt();
		// Formula ( F - 32) * 5/9;

		int convertedTemp = (temp - 32) * 5 / 9;//Celcius

		System.out.println("The temperature in the city " + cityName + " is " + convertedTemp + " C");

	}

}
