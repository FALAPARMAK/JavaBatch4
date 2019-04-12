package com.class20;

public class IsPaliondrome {
	
	
	 String name="Betul";
	public String result;
	
	static String   Reverse(String name) {
		
		String rev="";
		
		for(int i=name.length()-1; i>=0; i--) {
			rev+=name.charAt(i);
		}
		return rev;
		
	}
	
	
	
	   String str (String a) {
		
		String result="";
		String rev=Reverse(a);
		
		if(rev.equalsIgnoreCase(a)) {
			result ="Palindrome";
		}else {
			result ="Not palindrome";
		}
	return result;
		
	}
	
	
	
	

}
