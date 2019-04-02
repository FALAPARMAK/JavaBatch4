package com.clsss6;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		
	Scanner scan;
	int num1,num2;
	char operator = 0;
	int result =0;
	
	scan=new Scanner(System.in)	;
	System.out.println("Please enter two number");
	num1=scan.nextInt()	;
	num2=scan.nextInt();
	System.out.println("Please choose a operator");
	operator=scan.next().charAt(0);
	switch(operator) {
	
	case '+':
		result=num1 + num2 ;
		break;
	case '-':
		result= num1- num2;
		break;
	case'/':
		result= num1/num2;
		break;
	case'*':
		result=num1*num2;
		break;
		default:
		System.out.println("Unknown");
		
	}System.out.println("Your result is " + result);
	
		
	
		
		

	}

}
