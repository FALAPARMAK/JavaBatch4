package com.class17;

public class Greetings {

	public static void main(String[] args) {
		
		Greetings obj=new Greetings();//we are  creating obje inside main method
		obj.hello();
		//how to find largest number
		obj.findLargest(30, 32);
		obj.findLargest(20, 10);
		obj.findLargest(3000,488989 );
		obj.helloToInstructor("Awet");
		obj.helloToInstructor("Asel");
	} 
	
	void hello() {
		System.out.println("Hello");
	}
	void helloToInstructor(String name) {//method with 1 parameters
		System.out.println("Hello "+name);
	}

	void findLargest(int a, int b) {//method with 2 parameters
		//int a=10;
		//int b=20;
		if(a>b) {
			System.out.println("a is larger than b");
		}else {
			System.out.println("b is larger than a");
		}
		
	}
	
	
	
	
}
