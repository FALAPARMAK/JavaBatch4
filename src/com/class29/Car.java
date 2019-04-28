package com.class29;

public class Car {

	/*
	 * Create a Class Car that would have the following fields: regularPrice and
	 * color and method calculateSalePrice() which should be returning a price of
	 * the car. Create 2 sub classes: Sedan and Truck. The Truck class has field as
	 * weight and has its own implementation of calculateSalePrice() method in which
	 * returned price calculated as following: if weight>2000 then returned price
	 * should include 10%discount, otherwise 20%discount. The Sedan class has field
	 * as length and also does it is own implementation of calculateSalePrice(): if
	 * length of sedan is >20 feet then returned price should include 5%discount,
	 * otherwise 10%discount
	 * 
	 */

	int regularPrice;
	String color;
	
	
	public int calculateSalePrice(int a) {
		return regularPrice;
	}
	
}
class Sedan extends Car{
	
	Sedan(int a){
		super.regularPrice=a;
	}
	int length;
	public int calculateSalePrice(int length) {
		
		if(length > 20) {
			regularPrice= (int) (regularPrice*0.95);
		}else {
			regularPrice= (int) (regularPrice*0.90);
		}
		return regularPrice;
	}
	
}
class Truck extends Car{
	Truck(int a){
		super.regularPrice=a;
	}
	
	int weight;
	public int calculateSalePrice(int weight) {
		if(weight > 2000) {
			regularPrice= (int) (regularPrice*0.9);
		}else {
			regularPrice= (int) (regularPrice*0.8);
		}
		return regularPrice;
	}
	
	
	
}