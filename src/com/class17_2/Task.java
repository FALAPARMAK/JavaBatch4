package com.class17_2;

import java.util.Scanner;

public class Task {
	
/*write a program that reads a range of integers (start and end point)provided by a user
 * and then from that range prints the sum of the even and odd integers
 */
	
	

	public static void main(String[] args) {
		int startNumber;
		int endNumber;
		int sumEven=0;
		int sumOdd=0;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter two number");
		startNumber=scan.nextInt();
		endNumber=scan.nextInt();
		
		for(int a=startNumber;  a<=endNumber; a++ ) {
			if(a%2==0) {
				sumEven=sumEven+a;//sumEven+=a;
			}else {
				sumOdd=sumOdd+a;
			}
			
		}
		System.out.println("sum of even  numbers "+sumEven );
		System.out.println("sum of odd  numbers "+sumOdd );
		
		
		

		
		
		
		
		
		
		
		
		

	}

}
