package com.class5;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		/*
		 * 
		 * 
		 */
		double height=5.6;
		
		
		
	/*	Scanner scan=new Scanner(System.in);
		System.out.println("Please enter your height");
		height= scan.nextDouble();
		
		if(height< 5 ) {
			System.out.println("Small");
		}else if( height>5 && height <=6) {
			System.out.println("Medium");
		}else {
			System.out.println("Tall");
		}*/
		
		int quiz,midTerm,finalScore,avarage;
	
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter quiz,midterm,final score");
		quiz=scan.nextInt();
		midTerm=scan.nextInt();
		finalScore=scan.nextInt();
	
		
		avarage=(quiz+ midTerm+ finalScore)/3;
		System.out.println(" your avarage score is " +avarage);
		
		
		if(avarage>=90) {
			System.out.println("Grade A");
		}else if(avarage>=70 && avarage<=90) {
			System.out.println("Grade B");
		}else if(avarage>=50 && avarage<=70) {
			System.out.println("Grade C");
		}else {
			System.out.println("Grade F");
		}
		
		
		
		
		
		
		
		

	}

}
