package com.class21;

public class Students{
	/*
	 * 2. Create a Class called Students
	 * 
	 * Create three variables studentName , studentID and numberOfStudents Create
	 * three objects of the Students Class Set the value for studentName , studentID
	 * and increment the numberOfStudents for each object Print out total number of
	 * students
	 */
	
	 String studentName;
	 int StudentID;
	 int numberOfStudents;
	
	

	public static void main(String[] args) {
		
		Students student1=new Students();
		Students student2=new Students();
		Students student3=new Students();
		
		
        student1.studentName="Anna";
		student2.studentName="Tonny";
		student3.studentName="Maria";
		
		
		student1.StudentID=101;
		student2.StudentID=102;
		student3.StudentID=103;
		
		student1.numberOfStudents=5;
		student2.numberOfStudents=6;
		student3.numberOfStudents=7;
		
		student1.StudentInfo();
		student2.StudentInfo();
		student3.StudentInfo();
	} 
	void StudentInfo() {
		
		System.out.println(studentName+" "+StudentID+" "+numberOfStudents);
	}
	
	
	
	
	
	
	

}
