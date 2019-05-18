package com.class34;

public class Car {
	public String model;
	public String make;
	
	Car(String make,String model){
		this.make=make;
		this.model=model;
	}
	public  void print() {// ststic method only accaess stattic variable
		System.out.println(make+" "+model);
	}

}
