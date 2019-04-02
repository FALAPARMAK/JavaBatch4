package com.class3;

import java.util.Scanner;

public class Ifelself {

	public static void main(String[] args) {
	/*	 int num1=4;
		 int num2= 14;
		 
		 if(num1 < num2) {
			 System.out.println("I am if block");
			 System.out.println( " I have multiple lines to print");
			 System.out.println( "Num is larger than num2");
			 
		 }else if (num1>num2) {
			 System.out.println( " Num is larger");
			 
		 }else {
			 System.out.println(" Num is smaller");
		 }
*/
		 
		Scanner scan;
		int num1,num2,num3;
		
		scan=new Scanner(System.in);
		System.out.println("Enter  3 distrinct number");
		num1=scan.nextInt();
		num2=scan.nextInt();
		num3=scan.nextInt();
		
		if(num1<num2 && num2<num3 ) {
			System.out.println("num3 is the largest number");
		}else if(num2>num3 && num2>num1) {
			System.out.println("num2 is the largest number");
		}else {
			System.out.println("num1 is the largest number");
		}
		
		
		
		
		
		
		
		 
		 
		 
	} 

}
