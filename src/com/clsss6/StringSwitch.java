package com.clsss6;

import java.util.Scanner;

public class StringSwitch {

	public static void main(String[] args) {

		Scanner scan;
		String country;	
		String favoriteFood;

		scan = new Scanner(System.in);
		System.out.println("Please enter which country you are from");
		country = scan.nextLine();

		switch (country) {

		case "USA":
			favoriteFood = "Pizza";
			break;
		case "Russia":
			favoriteFood = "Pelmeni";
			break;
		case "Turkey":
			favoriteFood = "Baklava";
			break; 
		case"Moroco":
			favoriteFood= "Couscouus";
			break;
		default:
			favoriteFood="Unknown";
		}
		
		System.out.println(" Your favorite food is "+ favoriteFood);

	}

}
