package com.class14;

public class Task {

	public static void main(String[] args) {
		/*
		 * Create a String that will hold a sentence. Write a program to get a new
		 * String without any spaces.
		 * 
		 * Create a String that should be combination of letters, numbers and special
		 * characters. Find out how many alpha characters are there in the String.
		 * 
		 * You have a String a=“Is it saturday! Is it raining! Do we have a Java Class
		 * today?” How would you find out how many sentences are in that String?
		 */
		String str = "The wheather is rainy today.";

		String newString = str.replace(" ", "");
		System.out.println(newString);

		String str1 = "Hi 12**% everyone^@";
		String replaced = str1.replaceAll("[^a-zA-Z]", "");
		System.out.println(replaced.length());
		
		
		String a="Is it Saturday? Is it raining ? Do we have a Java Class today?";
		String []array=a.split("[?]4");
		System.out.println("The length of the array is "+array.length);
		
	}

}
