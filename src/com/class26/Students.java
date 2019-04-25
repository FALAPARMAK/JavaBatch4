package com.class26;

public class Students {

	String fullName;
	int age;
	
	//this is used to differantiate between local and instance variables
	public Students(String name, int ageNum) {
		this.fullName=fullName;
		this.age=age;
		
	}
	public void display() {
		System.out.println("Student full name is "+fullName+" and age "+age);
	}
	
	
	public static void main(String[] args) {
		Students obj=new Students("John Snow ", 30);
		obj.display();
	}
}
 