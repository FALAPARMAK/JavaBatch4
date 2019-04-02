package com.class13;

import java.util.Scanner;

public class Taskname {

	public static void main(String[] args) {
	
	/*	Write a program that reads two people’s first names and if they expecting 
	 * boy or girl? Based on the input suggests a name for a baby:
			Example Output:
			Mom’s first name? Mary
			Dad’s first name? Daniel
			Boy or Girl? boy
			Suggested baby name: DANRY

			Example Output:
			Mom’s first name? Mary
			Dad’s first name? Daniel 
			Boy or Girl? girl
			Suggested baby name: MAIEL
		*/
		
		String nameMom;
		String nameDad;
		String gender;
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter mother's name"); 
		nameMom=scan.nextLine();
		System.out.println("Please enter father's name"); 
		nameDad=scan.nextLine();
		System.out.println("Please enter baby's gender");
		gender=scan.nextLine();
		
		if(gender.equalsIgnoreCase("boy")){
			System.out.println("Suggested baby name is: ");
			System.out.println(nameDad.toUpperCase().substring(0, nameDad.length()/2).concat
					(nameMom.toUpperCase().substring(2)));
			
			
		}if(gender.equalsIgnoreCase("girl")) {
			System.out.println("Suggested baby name is: ");
			System.out.println(nameMom.toUpperCase().substring(0, nameMom.length()/2).concat
					(nameDad.toUpperCase().substring(3)));
		}
		
		
		
		
		
		
	}

}
