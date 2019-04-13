package com.class22;


public class SyntaxStudents {
	public static String schoolName="Syntax";
	public static int batchNumber=4;
	
	public String studentName;
	public String lastName;
	
	
	SyntaxStudents(String name, String lastName){
		studentName=name;
		lastName=lastName;
	}
	
	public void getStudentDetails() {
		String details="I am a student at "+schoolName+" from batch "+batchNumber+" and my name is "+
				studentName+" "+ lastName;
		System.out.println(details);
	}

	
}
