package com.class25;

public class Parent2 {

	void m1(){
		System.out.println("I am in parent class");
	}
	
	
}
class Subclass extends Parent2{
	
	void m1() {
		System.out.println("I am in child class");
	}
	
	void m2() {
		System.out.println("I am m2");
	}
}

class Test{
	public static void main(String[] args) {
		
		
		
		Parent2 s=new Subclass();
		s.m1();//in child class
		//s.m2();//error subclassa ait.Overriding olsaydi ulasabilirdik.
		         // method is not defined
		
	}
}

