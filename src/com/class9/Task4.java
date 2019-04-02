package com.class9;

public class Task4 {

	public static void main(String[] args) {
		
		
	/*	4. Print the following pattern:
			*                                 for(int x=4; x>=1;x--) {
			
			                                 for (int z=1; z<=x; z++ ) {
				
			**
			***
			****     rows 9, columns 5
			*****
			****
			***
			**
			*
*/
		
		for(int i=1; i<=5; i++) {
			for (int a=1; a<=i; a++) {
				System.out.print("*");
				}
				System.out.println("");
			}
			 
		for(int x=1; x<=4;x++) {
			
			for (int z=4; z>=x; z-- ) {
				
				System.out.print("*");
			}
			System.out.println("");
		}
		
		
		
		 
		}
		
		
		
		
		
		
		
		
		
		

	}


