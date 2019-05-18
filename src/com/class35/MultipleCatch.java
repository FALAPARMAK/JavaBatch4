package com.class35;

public class MultipleCatch {

	public static void main(String[] args) {
	System.out.println("Beginning of code");
		try {
			Thread.sleep(2000);// new InterruptedException
			System.out.println(10/0);//new ArithmeticException 
		}catch(ArithmeticException a) {
			//3 ways to print name and details of an exception
			
//			a.printStackTrace();// name of E,details of E,location
//			System.out.println(a);//name of E and details
			System.out.println(a.getMessage());//details of an E
			
			System.out.println("Code of  ArithmeticExceptio catch");
		}catch(InterruptedException e) {
			System.out.println("Code ofInterruptedException catch");
		}
		
		
		
	}

}
