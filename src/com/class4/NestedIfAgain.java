package com.class4;

public class NestedIfAgain {

	public static void main(String[] args) {
		// declare variable for gpa and having a diploma
		//if user has a  diploma -> congrulation
		
		
		double gpa= 3.0;
		double expextedGpa= 3.7;
		
		boolean hasDiploma = true;
		
		if (hasDiploma ) {
			System.out.println( " CONGURALATIONS");
			if (gpa> expextedGpa) {
				System.out.println("You are hired");
			}else {
				System.out.println("we can not hire you");
			}
		}else {// it works  when it  be false
			System.out.println( "please get  your degree");
			
		}
		
		
 
	} 

}
