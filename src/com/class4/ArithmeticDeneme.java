package com.class4;

public class ArithmeticDeneme {

	public static void main(String[] args) {

		double a = 12.3; 
		double b = 20.2;

		double sum = a + b;
		double sub = a - b; 
		double mult = a * b;
		double div = a / b;

		System.out.println("The sum  of 2 numbers " + a + " and " + b + " is equal to" + sum + ".");
		System.out.println("The sub of 2 numbers " + a + " and" + b + " is equal to" + sub + ".");
		System.out.println("The mult  of 2 numbers " + a + " and" + b + " is equal to  " + mult + ".");
		System.out.println("The div of 2 numbers " + a + " and" + b + " is equal to" + div + ".");

		double c = 3.9;
		double square = c * c;

		System.out.println("The square of the " + c + " is " + square + ".");

		int width = 5;
		int height = 8;
		int perimeter = 2 * (width + height);
		
		int area= width* height;
		
		System.out.println("The perimeter of a rectangle with width " + width + " and " + height + " is equal to " + perimeter + " and the area is " + area +".");

	}

}
