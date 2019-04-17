package com.class24;

public class Task3 {
	/*
	 * Create 1 class with a private method that has 3 overloaded forms. Then call
	 * each overloaded method with specific arguments and observe result.
	 * 
	 */

	private static  void Print() {
		System.out.println();
	}

	private static void Print(String str) {
		System.out.println(str);
	}

	private static void Print(String str,String str1) {
      System.out.println(str+" "+str1);
	}
	
public static void main(String[] args) {
	
	
	Print();
	Print("Hello");
	Print("Hello","Bye");
	
}
}
