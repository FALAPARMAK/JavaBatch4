package com.review;

import java.util.Scanner;

public class Review4 {

	public static void main(String[] args) {

		/*
		 * /boolean summer= true; boolean sunny= false;
		 * 
		 * if(summer==false) { if(sunny==true) { System.out.println(" Go on vacation");
		 * }if(sunny==false) { System.out.println(" we are  not going to vacation" ); }
		 * 
		 * }else { System.out.println("no vacation"); } /
		 */

		

		String name, gender;
		
		int age;
		long mobileNo;

		Scanner scan = new Scanner(System.in);
		System.out.println(" Please enter a name");
		name= scan.nextLine();
		
	
		System.out.println(" Name: " + name); 
		System.out.println(" What is the gender");
		 gender=scan.nextLine();
		
		System.out.println(" Gender: " + gender);
		
		System.out.println(" How old are you");
		 age= scan.nextInt();
		System.out.println(" Age: " + age);
		
		System.out.println( "What is the phone number");
	    mobileNo= scan.nextLong();
		System.out.println("MobileNo : " + mobileNo);
		
	}

}
