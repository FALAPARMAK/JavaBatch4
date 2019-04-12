package com.class20;

public class Paliondrome {
 public  static String  Paliondrome(String name) {
		 
		 String rev="";// before loop
		 String result="";
			for(int i= name.length()-1;  i>=0; i--) {
				
				  rev+=name.charAt(i);
				
			}if(name.equalsIgnoreCase(rev)) {
				result="Paliondrome";
			}else {
				result=" Not Paliondrome";
			}
			return result;//outside loop
	 }
}
