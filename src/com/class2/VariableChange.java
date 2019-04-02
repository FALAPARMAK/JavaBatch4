package com.class2;

public class VariableChange {

	public static void main(String[] args) {
		// Values of variables can change
		
		String name = "John";
		String lastname = "Smith";
		lastname= "Johnson";
		
		char grade = 'A';
		

		
		//char grade = 'A'; dont work
		
		
		
		
		
		String city = "Fairfax";
		String city2 = "Newyork";
		
		System.out.println(city);
		city = "New York";//Value of variable is changed
		
		
		//System.out.println(grade);
		System.out.println(lastname);
		System.out.println(city);
		

	}

}
