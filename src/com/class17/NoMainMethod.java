package com.class17;

public class NoMainMethod {
	//methods and variables are member of the class
	String str;//data members
	int num;
	
	
	void hello() {
		System.out.println("Hello");
		System.out.println("hello friends");
	}void bye(){
		System.out.println("bye");
	}
	
	
	public static void main(String[] args) {//method signature
		
		NoMainMethod obj=new NoMainMethod ();//method body
		obj.hello();//we calling a method hello
		obj.bye();
	}
	
	
	
	
	
	
	
	

}
