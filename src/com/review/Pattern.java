package com.review;

public class Pattern {

	public static void main(String[] args) {
		/*Write a program that prints the following pattern
        *
       ....1
       ...2
       ..3
       .4
       5
		 */
//--------------------------------
		
		
		/** Write a program to produce the following pattern
        *
      ....1
      ...2.
      ..3..
      .4...
      5....
		 * 
		 */
		for(int i=1; i<=5; i++) {
			for(int k=1; k<(5-i); k++)
				System.out.print(".");
			System.out.println(" ");
		   }
		   System.out.println(" ");  
		}
		
		
	}


