package com.class7;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		//Ask user to pay for a soda
		//keep asking user to pay for soda until entered price is not equal to 1.99
		// after user got a write amount print "please enjoy your soda
		
		Scanner scan;
		double price;
		int a=1;
		scan=new Scanner(System.in);
		
		
		do {
			System.out.println("Enter the price of the soda");
			price=scan.nextDouble();
			a++;
		}while(price!=1.99);
		System.out.println("please enjoy your soda");
		
		

	}

}
