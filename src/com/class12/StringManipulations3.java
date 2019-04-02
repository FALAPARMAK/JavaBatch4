package com.class12;

public class StringManipulations3 {

	public static void main(String[] args) {
		
		String str="Students";
		
		char character=str.charAt(4); 
		System.out.println(character);
		
		
		for(int i=0; i<str.length(); i++) {
			System.out.print(str.charAt(i)+",");
		}
		System.out.println();
		
		//indexOf ()-returns an index of specified character
System.out.println("--------indexOf--------");
		
		String str1="Sunday";
		int index =str1.indexOf("S");
		System.out.println(index);
		
		
		String str2="Syntax Technologies";
		
		System.out.println(str2.indexOf("Syntax"));
		System.out.println(str2.indexOf("Technologies"));
		System.out.println(str2.indexOf(" "));
		System.out.println(str2.indexOf("w"));
		
	System.out.println("----------------");	
		
		String str3="Today is Sunday Java class";
		String newString=str3.substring(0);//int begin index
		System.out.println(newString);
		
		System.out.println(str3.substring(0, 5));//Today //begin index end index
		System.out.println(str3.substring(9, 20));//Sunday Java
		System.out.println(str3.substring(21));//class
	}

}
