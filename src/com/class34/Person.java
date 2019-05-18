package com.class34;

public class Person {
	/*
	 * Create a Person class with following
	 * private fields: name, lastName, age, salary. Variables should be initialized
	 * through constructor. Inside the class also create a method to print user
	 * details. In Test Class create a Map to store personId and a Person Object.
	 * Print each object details.
	 */
	String name;
	String lastName;
	int age;
	int salary;
	public Person(String name, String lastName, int age, int salary) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.age = age;
		this.salary = salary;
	}
	
	public void print(){
		System.out.println(name+" "+lastName+" "+age+" "+salary);
	}
	
}
