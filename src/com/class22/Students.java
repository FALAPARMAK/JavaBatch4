package com.class22;

public class Students {
	/*
	 * Write a java program of Class Students that takes students name and 3 subject
	 * grades. Inside your class also have a method to Calculate Average Grade. Test
	 * Student class for 5 different students with different marks. Your program
	 * should print an average mark of each students name. NOTE: please male
	 * different names for instance and local variables.
	 */

	String studentName;
	  int gradeM;
      int gradeB;
	  int gradeE;

	
	
public  Students(String name, int a, int b,int c) {
	studentName=name;
	gradeM=a;
	gradeM=b;
	gradeM=c;
	
	
}
public   void GetAvarage() {
	int avarage=gradeM+gradeB+gradeE/3;
	System.out.println("My name is "+ studentName+ " my average grade is "+ avarage);
}

	

}
