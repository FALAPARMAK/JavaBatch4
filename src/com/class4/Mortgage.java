package com.class4;

public class Mortgage {

	public static void main(String[] args) {
	
		double mortageRate = 4.3;
		int mortagePrice = 100000;
		
		
		if ( mortageRate < 4.5) {
			System.out.println( " I will consider buying the house");
			if( mortagePrice < 200000) {
				System.out.println("I am paying with cash");
			}else {
				System.out.println( " I will take a loan");
			}
		}else {
			System.out.println(" I wiil not buy that house");
		}

	} 

	} 
