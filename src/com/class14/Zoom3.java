package com.class14;

public class Zoom3 {

	public static void main(String[] args) {
	    
		//* 3. Find out how many alpha characters present in a string?
		          
		        
		        String str="Find out how many alpha characters present in a string?";
		        String arr=str.replaceAll("[^A-Za-z]","");
		        System.out.println(arr.length()-1);
	}

}
