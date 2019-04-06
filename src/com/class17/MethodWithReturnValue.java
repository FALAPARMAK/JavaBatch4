package com.class17;

public class MethodWithReturnValue {

	public static void main(String[] args) {
		
		String str="Hello";
	   
	    
		int stringLength=str.length();//int stringLength=5
		System.out.println("stringLength");
		
		char character= str.charAt(4);
		System.out.println(character);
		
		MethodWithReturnValue  obj=new MethodWithReturnValue ();	
		obj.askHowAreYou("Asel");
		
		
		
		String day=obj.whatIsADay();
		System.out.println("Today is "+day);	
		
		
	}
	void askHowAreYou(String name) {//parameter
		System.out.println("How are you "+ name);
	}
     String whatIsADay() {
	  System.out.println("I am inside a method");
	  return "Tuesday";
  }
   
   
}
