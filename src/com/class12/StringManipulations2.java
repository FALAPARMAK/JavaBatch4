package com.class12;

public class StringManipulations2 {

	public static void main(String[] args) {
	//contains ()	--> checks for specific value in the string(
		
	String str="Good morning, students!";	
	boolean contains=str.contains("students");	
	System.out.println(contains);
	
	
	String present="welcome, mehmet28877";
	String neededValue="welcome";
	
	//boolean flag= present.contains()
	
	
	boolean flag1=present.toUpperCase().contains(neededValue);
	System.out.println(flag1);	
	
	
	System.out.println("----StartWith & EndWith-----");
	
	String str1="syntax";
	boolean starts=str1.startsWith("s");
	System.out.println(starts);
	
	System.out.println("----isEmpty-----");
	
	String str2=" ";
	boolean isEmpty=str2.isEmpty();
	System.out.println(isEmpty);
	
	//
	System.out.println("----concat-----");
	
	String str3="Hello";
	String str4="Ali!";
	System.out.println(str3+str4);
	System.out.println(str3.concat(str4));
	
	System.out.println("--------");
	//
	String expected="You may qualify for a multi-policy discount!";
	String actual="You may qualify for a multi-policy discount!";
	actual=actual.trim();
	
	}

}
