package com.class20;

public class Array {
	// Create a method that will take a string and return array of words from that
	// string.
	// Method should be available only within same class.

	public static void main(String[] args) {

		Array obj = new Array();
 
		String array[] = obj.GetWordArray("Have a good night");

		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

	}

	
	private String[] GetWordArray(String str) {
		String [] words = str.split(" ");
		return words;
	}

}
