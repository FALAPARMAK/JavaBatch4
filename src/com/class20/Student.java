package com.class20;

public class Student {

	char getGrade(int score) {
		char grade;
		if (score < 100 && score >= 90) {
			grade = 'A';
		} else if (score < 90 && score >= 80) {
			grade = 'B';
		} else if (score < 80 && score > 70) {
			grade = 'C';
		} else {
			grade = 'D';

		}
		return grade;
	}
	
	
	
	
	

	
	
	
	

	public static void main(String[] args) {
		Student obj=new Student();
		System.out.println(obj.getGrade(90));

	}

	
	
}
