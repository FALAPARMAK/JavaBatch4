package com.class15;

import java.util.Scanner;

public class IQ7 {

	public static void main(String[] args) {
		//7. Write a java program to check whether a given number is prime or not?

	int number;
	Scanner scan=new Scanner(System.in);
		
	System.out.println("Please enter a number");	
	number=scan.nextInt();
	
	boolean prime = true;
	for (int i = 2; i < number; i++) {
		if (number % i != 0) {

		}else {
			prime = false;
			break;
		}
	}

	
	System.out.println(prime);
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
		
		
		
		
		
		
		
		
	
		
		
	

}
