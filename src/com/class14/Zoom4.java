package com.class14;

public class Zoom4 {

	public static void main(String[] args) {
		
		//How to find out the part of the string from a string? 
		//What is substring? Find number of words in string?
		
		
		String str="How to find out the part of the string from a string? ";
		
		String[] newString=str.split(" ");
		System.out.println(newString.length);
		
		System.out.println(str.substring(str.length()/2));
		
		

	}

}
