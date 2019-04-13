package com.class22;

public class TestSyntaxStudents {

	public static void main(String[] args) {
		// SyntaxStudents student1=new SyntaxStudents();
		// student1.studentName="Betul";
		// student1.lastName="Alaparmak";

		// student1.getStudentDetails();

		// SyntaxStudents student2=new SyntaxStudents();
		// student2.studentName="Hilal";
		// student2.lastName="Kalyoncu";

		// student2.getStudentDetails();

		SyntaxStudents student3 = new SyntaxStudents("Asha ", "Noman");
		SyntaxStudents student4 = new SyntaxStudents("Betul ", "Temiz");
		student3.getStudentDetails();
		student4.getStudentDetails();
	}

}
