package com.class24;

public class Task {
	/*Create 1 class with a static method that has 3 overloaded forms. 
	 * Then call each overloaded method with specific arguments and observe result.
	 * 
	 * 
	 */

	
	
	public static void test(int a) {
		System.out.println(a);
	}
	
	public static void add(int a,int b) {
		System.out.println(a+b);
	}
	
	public static void mix(String a,int b) {
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		
		test(7);
		add(2,8);
		mix("Number",2);
		
		
	}
	
	
	
}
