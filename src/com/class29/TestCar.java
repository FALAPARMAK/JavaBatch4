package com.class29;

public class TestCar {

	public static void main(String[] args) {
		
		Car obj=new Sedan(100);
		System.out.println(obj.calculateSalePrice(30));
		Car obj1=new Truck(3000);
		System.out.println(obj1.calculateSalePrice(1500));

	}

}
