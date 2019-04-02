package com.class12;

public class StringManipulations {

	public static void main(String[] args) {
	// Length function or 	
		
	String str="Syntax";	
	int length0fString=str.length();	
	System.out.println(length0fString);	
	
	String str1="Syntax Technologies";
		
	int length0f2String=str1.length();	
	System.out.println(length0f2String);		
		
		
	///UPPER CASE , LOWER CASE
	String str3="Hello";
	
	String newString=str3.toUpperCase();
	System.out.println(newString);
	
	String lowerCaseString=newString.toLowerCase();
	System.out.println(lowerCaseString);
	
	///
	
	String str4="Hello";
	String str5="hello";
	
	/////EQUALITY
	
	boolean equality=str4.equals(str5);
	System.out.println(equality);
	
	//egualsIgnoreCase() --compares 2 string but ignores case
	String expectedBrowser="Chrome";
	String actualBrowser="chrome";
	
	boolean equals=expectedBrowser.equalsIgnoreCase(actualBrowser);
	System.out.println(equals);
	}

}
