package com.class31;

public class Student {
	public String name;
	public int studentId;

	Student (String name, int studentId){
		this.name=name;
		this. studentId= studentId;
	}
	public void Print() {
		System.out.println(name+" "+studentId);
	}
	
}
