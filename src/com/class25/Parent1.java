package com.class25;

public class Parent1 {
	
	Parent1(){
		System.out.println("I am a parent constructor");
	}

}

class child extends Parent1{
	
	//int num;
	child(){
		System.out.println("I am a child constructor");
	}
}