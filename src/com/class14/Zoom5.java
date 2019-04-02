package com.class14;

public class Zoom5 {

	public static void main(String[] args) {
		// 5. Write a java program to reverse String? Reverse a string word by word?

		
		
		String str = "This is a Java program";
		String reverse = "";

		char[] array = str.toCharArray();

		for (int i = str.length()-1;   i > 0;   i--) {
			reverse += array[i];
		}
		System.out.println(reverse);
		
		
		
		
		
		
		
		
	}

}
