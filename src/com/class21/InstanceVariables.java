package com.class21;

public class InstanceVariables {//

	protected String name = "John";// instance -global variable

	public static void main(String[] args) {
		
		String name = "Anna";// local variable
		System.out.println(name);
		System.out.println("---Changing value of local variable----");
		name="Olga";
		System.out.println(name);
		//creating 1 object
		InstanceVariables obj=new InstanceVariables();
		System.out.println(obj.name);
		System.out.println("---------changing value of instance variable----");
		obj.name="Jack";
		System.out.println(name);
		//creating second object
		InstanceVariables obj1=new InstanceVariables();
		System.out.println(obj1.name);
		
	}

	public void hello(String name) {
		System.out.println("Hello"+name);
	}
}
