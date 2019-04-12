package com.class20;

public class Task {

	public static void main(String[] args) {
		
		
		/*Create a method createEmail
		 * Based on provided users name, last name and email type
		 * your method should return complete email adress 
		 */

		
		Task obj=new Task();
		String email=obj.createEmail("John","snow", "yahoo.com");
		System.out.println(email.toLowerCase());
		
		
		email=obj.createEmail("bob", "snow", "outlook");
		System.out.println(email);
		 
		
		
		Task obj1=new Task();
		char grade=obj1.getGrade( 90);
		
		System.out.println(obj1.getGrade(grade));
		/////////or////////////
	    System.out.println(grade);
	
		
		
		}//return type methodName
	
	
	String createEmail(String name,String lastName , String emailType) {
		String emailAdress=name+lastName+"@"+emailType;
		return emailAdress;
		
		
		
		
		
	}/*
	//Create class student that will have a method getGrade
	//your method should accept the score of a student and return a grade
	 * 
	 */
	
	 char getGrade( int score) {
		
		char grade='0';
		
		if(score>90) {
			grade= 'A';
		}if(score>80) {
			grade='B';	
		}if(score>70) {
			grade='C';
			
		}if(score>50) {
			grade='D';
		}else {
			grade='F';
		}
		return grade;
	}	
	
	
	
		
		
	
	
	
	
	
	
	
	

}
