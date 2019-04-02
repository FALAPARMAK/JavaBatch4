package com.class4;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		
		int loanMoney;
		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("What is the amount of loan is needed");
		
		
		loanMoney=sc.nextInt();
		if(loanMoney<200000) {
			
		System.out.println("You can get the money");	
			
		}else {
			System.out.println("Sorry. You can not the money");
			
		}
		
			
		

	}

}
