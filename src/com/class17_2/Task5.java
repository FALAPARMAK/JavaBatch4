package com.class17_2;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		/*
		 * Write a guessing game where the user has to guess a secret number between 1 and 20.
		 *  After every guess input, 
		 * the program tells the user whether their number was too large or too small. 
		 * The program will keep asking the user to enter the number until he finds the
		 *  correct number. When the correct answer is found the system should display
		 *   "Congratulations!!. You got it!".
		 */
		
		// Do while da dene
		
		int guessNum=10;
		int num=3;
		Scanner scan=new Scanner(System.in);
		
		
		
		
		
		
	 	
		for( int a=1; a<=20; a++) {
			System.out.println("Guess a number between 1 and 20 please ");
			num=scan.nextInt();
			
			
				if(num<guessNum) {
					System.out.println("Your number is small");
				}else if(num>guessNum) {
					System.out.println("Your number is large");
				}else if(num==guessNum) {
					System.out.println("Congratulations..");
					break;
				}
					
					
				
		
		
		}
		
		
	
	}

}