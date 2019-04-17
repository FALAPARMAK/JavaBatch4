package com.class21;

public class Car {
	public String color;// null
	 static int totalCars;// 0+1=1+1=2//static olmazsa instance olur.obj gerekir

	public static void main(String[] args) {
		Car car1 = new Car();
		car1.color = "White black and purple";
		Car.totalCars++;

		Car car2 = new Car();
		car2.color = "Black";
		Car.totalCars++;
		Car.totalCars++;

		System.out.println("Total car we made is " + car2.totalCars);
	}

}
