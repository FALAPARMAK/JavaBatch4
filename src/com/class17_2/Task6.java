package com.class17_2;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
	//	Ask a user to input a leap year. Give the user 10 chances to enter
	//	a correct leap year. As soon as the user enters the correct
	//	leap year exit the loop.

	Scanner scan=new Scanner(System.in);	
		
	for(int i=1; i<=10; i++) {
		System.out.println("Please enter a leap year");
		int year=scan.nextInt();
		
		if(year%4==0) {
			if(year%100==0) {
				if(year%400==0) {
					System.out.println("The year is leap year");
				}else {
					System.out.println("The year is not leap year");
				}
				
			}else {
				System.out.println("The year is  leap year");
	 		}
			
		}else {
			System.out.println("The year is not leap year");
		}
		
		
		
	}
		
		
	System.out.println("you can not try more");
		
		
		
	}

}
