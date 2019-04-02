package com.class5;

public class NestedIf {

	public static void main(String[] args) {
		
	/*	int num1= 23;
		int num2=24;
		
		if(num1>num2) {
			System.out.println("num1 is larger");
		}else {
			System.out.println("num1 is smaller");
			
			
			
			
			
			check if user has credit card
			check what is the balance  if  balance
		}*/
		
		boolean creditCard= true;
		int balance= 900;
		
		if(creditCard) {
			System.out.println("Let is check the balance");
			if(balance>=1000) {
				System.out.println(" pay off now");
			}else if(balance==0) {
					System.out.println(" Use your card");
			}else {
				System.out.println(" You are safe");
			}
		}else {
			System.out.println(" Do you hwant a credit card");
		}
		
		
		
		
		
		
		
		

	}

}
