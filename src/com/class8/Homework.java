package com.class8;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		
		Scanner scan;
		double price;
		
		scan=new Scanner(System.in);
		
		do {
			System.out.println(" pay for soda");
			price=scan.nextDouble();
			System.out.println(" I am inside of loop");
			
			
		}while(price!=1.99);//true oldugunda calisir
		System.out.println(" I am outside of loop");
		System.out.println(" Enjoy soda");
		
		
		
		
		

	}

}
