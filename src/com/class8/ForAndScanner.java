package com.class8;

import java.util.Scanner;

public class ForAndScanner {

	public static void main(String[] args) {
		
		//prompt user to enter 2 integers and compare
		//at the end print largest
		
		Scanner myScanner=null;
		int num1, num2;
		int largest=0;
		
		
		
		Scanner Scanner = new Scanner(System.in);
		num2=myScanner.nextInt();
		
		for(int i=1; i<=5; i++) {
			System.out.println("enter 2 numbers");
			num1=myScanner.nextInt();
			num2=myScanner.nextInt();
			if(num1>num2) {
				largest=num1;
			}else {
				System.out.println(num1+ " is equals to " + num2);
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
