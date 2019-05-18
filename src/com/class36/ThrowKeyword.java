package com.class36;

public class ThrowKeyword {

	public static void main(String[] args) {
	
		//checkEligibility(9);
		divison(10,10);
		checkLength("Ali");
		//if person is >18 years old --->issue driver license  else--->throw an exception
	}	
	public static void checkEligibility(int age) {
		if(age>=18) {
			System.out.println("Congratilations");
		}else {
			throw new ArithmeticException("You are not eligible");
		}
	}
		
	public static void divison(int a, int b) {
		if(b!=0) {
			System.out.println(a/b);
		}else {
			throw new ArithmeticException("we cannnot divide by zero");
		}
	}
	
	public static void checkLength(String username) {
		if(username.length()>3) {
			System.out.println("username accepted");
		}else {
			throw new NullPointerException("username must be long 3 character");
		}
	}
		
	

}
