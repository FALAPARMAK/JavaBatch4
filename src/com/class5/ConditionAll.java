package com.class5;

import java.util.Scanner;

public class ConditionAll {

	public static void main(String[] args) {
		/*
		 * 
		 * 
		 */
		Scanner scan;
		boolean sale;
		double discount;
		double price;
		double finalPrice;
		
		scan= new Scanner(System.in);
		System.out.println("Please enter if there is a sale");
		sale=scan.nextBoolean();
		
		
		
		if(sale) {
			System.out.println("Please enter price of the item");
			price= scan.nextInt();
			
			System.out.println("Lets check all discounts");
			if(price <20) {
				discount=20;
				finalPrice= price-(price*0.2);
			}else if(price>=20 && price<100) {
				discount=30;
				finalPrice=price-(price*0.3);
			}else if(price>=100 && price<500) {
				discount=50;
				finalPrice=price-(price*0.5);
			}
		}else {
			System.out.println("Not interseted");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
