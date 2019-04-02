package com.class4;

public class NestedIf {

	public static void main(String[] args) {
		// write a program to check work eligibility
		//if user is younger than < 16 - - > not allowed to work
		//
		
		int  age = 70;
		 int eligibleAge= 16;
		 int retirementAge = 64;
		 
		 if(age < eligibleAge) {
			 System.out.println("You are too young");
		 }else {
			 System.out.println("You are eligible to work");
			 if (age< retirementAge) {
				 System.out.println( " you  work hardly");
		
			 }else {
				 System.out.println( " please enyoj your life");
			 }
		 }
		 
		 
		

	}

}
