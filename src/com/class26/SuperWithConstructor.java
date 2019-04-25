package com.class26;

public class SuperWithConstructor {
	
	public SuperWithConstructor() {
		System.out.println("I am a parent class constructor");
	}
	public SuperWithConstructor(String str) {
		System.out.println("I am a parent class constructor one parameter ");
	}

}


class ChildSuperWithConstructor extends SuperWithConstructor{
	//super();  compiler adds it by default
	
	
	  ChildSuperWithConstructor() {
		  super("Hello");
		System.out.println("I am a child class constructor");
	}
	  
	  
}