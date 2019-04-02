package com.class14;

public class TaskGroup {

	public static void main(String[] args) {
		// 1. Write a program to swap 2 numbers without a temporary variable? Swap 2
		// strings without a temporary variable?
		// 2.Write a java program to find the second largest number in the array?
		// Maximum and minimum number in the array?
		// 3. Find out how many alpha characters present in a string?
		// 4.How to find out the part of the string from a string? What is substring?
		// Find number of words in string?
		// 5. Write a java program to reverse String? Reverse a string word by word?

		//Task1
    String str="He has 2 friends ang 3 brothers";
		
		String newStr=str.replace("2", "3");
		System.out.println(newStr);
		
		
		//Task3
	String 	str1="Today1^ is *Saturday&";	
	String replaced = str1.replaceAll("[^a-zA-Z]", "");
	System.out.println(replaced.length());
	
		//
		//Task 4
	  String str2="Hello everyone ";
	  String newString=str2.substring(6);
		System.out.println(newString);
		
		
		
		
		
		
	}

}
