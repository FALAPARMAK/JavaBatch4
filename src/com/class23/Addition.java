package com.class23;

public class Addition {
      //overloading methods by changing number of parameters
	public void Add(int a, int b) {
		System.out.println("Method to add 2 integers");
		System.out.println(a+b);
	}
	
	
	public void add(int a) {
		System.out.println("Method to add 100 integers");
		System.out.println(a+100);
	}
	
	public void add(int a, int b, int c) {
		System.out.println("Method to add 3 integers");
		System.out.println(a+b+c);
	}
	//2. overloading method by changing the data type of the parameters
	public void add(double a, double b) {
		System.out.println("Method to add 2 integers");
		System.out.println(a+b);
	}
	public void add(int a, double b) {
		System.out.println("Method to add 1 integers and 1 double value");
		System.out.println(a+b);
	}
	
	public void add(double a, double b ,double c) {
		System.out.println("Method to add 3 double values");
		System.out.println(a+b+c);
	}
}
