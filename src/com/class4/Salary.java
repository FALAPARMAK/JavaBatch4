package com.class4;

import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println( " Please enter your work year");
  
		int workYear;
		int annualSalary;
		
		
		
		
		workYear= scan.nextInt();
		System.out.println("Please enter annual salary");
		
		
		annualSalary= scan.nextInt();
		
		
		
		if(workYear > 5) {
			System.out.println( "You can get bonus");
			if (annualSalary>200000) {
			System.out.println("Your bonus is 5000");	
			}
			else {
				System.out.println("Your  bonus is 2000");
			}
			
			
		}else {
			System.out.println(" You are not eligibility for bonus");
		}
		
		
		
		
		
		
		
		
		

	}

}
