package com.class35;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task {

	public static void main(String[] args) {

		int num ;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("please enter a student number");
		num = scan.nextInt();
		
		
		try {
			num = scan.nextInt();
		}catch(InputMismatchException e) {
			System.out.println("enter only a number");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		

	}

}
