package com.class22;

public class StudentA {
	String Studentname;
	int grade1, grade2, grade3;
	
	public void Student (String name , int a, int b, int c) {
		Studentname=name;
		grade1=a;
		grade2=b;
		grade3=c;
	}

	public  void getAverage() {
		int average=(grade1+ grade2+grade3)/3;
		System.out.println("My name is "+ Studentname+ "my avarage is "+ average);
	}
}
