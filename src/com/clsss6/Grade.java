package com.clsss6;

import java.util.Scanner;

public class Grade {

	private static String A;

	public static void main(String[] args) {
		
		Scanner scan;
		char grade;
		String explanation;
		
		scan= new Scanner(System.in);
		System.out.println("Enter a grade ");
		grade=scan.next().charAt(0);
		
		switch(grade) {
		
		
		case 'A':
			explanation = "Excellent";
			break;
		case'B':
			explanation = "Good";
			break;
		case 'C':
			explanation = "Avarage";
			break;
		case'D':
			explanation = "Bad";
			default:
				explanation = "Invalid";
			
		
		}System.out.println("Your grade is "+explanation );
		
		
		

	}

	
	}


