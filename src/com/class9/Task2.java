package com.class9;

import java.util.Scanner;

public class Task2 {
//.  Ask user to enter the item they want to buy and  the price
//for the item. Then ask user to pay for it. Every time user enters money accumulate the 
//	amount and tell user how much is left to pay off the amount. Whenever user done with payments tell
//	them "Thank you for shopping!"

	public static void main(String[] args) {
		String item;
		
	int price=0;
		
		int change;
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("What do you buy ?");
		item=scan.nextLine();
		System.out.println("Enter the price of the item please");
		price=scan.nextInt();
		
		int price1 = 0,payment ,sum = 0;
		
		
		do {
			System.out.println("please enter payment");
		    payment=scan.nextInt();
			sum=sum+payment;
			change=price-sum;
			System.out.println("please enter more "+change);
			
	break;
			
			
		}while(sum!=payment); 
			
		System.out.println("Thank you");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
		
			
		
		
			
		
	
		
		
				
}	

	


