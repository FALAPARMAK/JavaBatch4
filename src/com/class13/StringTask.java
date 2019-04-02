package com.class13;

public class StringTask {

	public static void main(String[] args) {
		/*Create a String and print it in reverse order (Sunday → yadnuS).

          Create a String and if the String is not empty perform
          the following: if the String has an odd number of characters 
          and has 3 or more characters, print the character in the middle of the String
		 
		*/
		String str="Sunday";
		
		for(int i=str.length()-1; i>=0; i--) {
			System.out.println(str.charAt(i));
		}
		
System.out.println();
		
		String day="Thuersday";
		
		
		
		if(!day.isEmpty()) {
			if(day.length()%2==1 && day.length()>=3) {
				System.out.println(day.charAt(day.length()/2));
		}
		
		
		
		
		
			
		}
		
		
		
		
		 
		
		
		
		
	}

}
