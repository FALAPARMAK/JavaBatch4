package com.class17_2;

import java.util.Scanner;

public class TaskIki {

	public static void main(String[] args) {
		
	Scanner scan=new Scanner(System.in);
	System.out.println("please enter item");
	String item=scan.nextLine()	;
	System.out.println("please enter the price of " +item);
	Double price=scan.nextDouble();
	double left=0.0;
	double total=0.0;
	double total1=0.0;
	
	
	do {
		System.out.println("Please pay for item");
		double money=scan.nextDouble();
		total=total+money;
		left=price-total;
		
		System.out.println(left + " is left to pay of the price");
	}while(left!=0);
	System.out.println("Thank you");
		
		
	
	
	
	
		
		
	}		
		
}
