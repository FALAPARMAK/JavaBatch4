package com.class34;

import java.util.*;

public class CarTest {

	public static void main(String[] args) {
		
	//Create a map in which we will store the carNum

		Car car1=new Car("Toyota", "Corolla");
		Car car2=new Car("Honda", "Accord");
		Car car3=new Car("Lada", "Priora");
		
		car1.print();
		car2.print();
		car3.print();
		
		Map<Integer,Car>carMap=new HashMap<>();
		carMap.put(1,new Car("BMW","x8"));
		carMap.put(2,new Car("Audi","R8"));
		
		Collection<Car>carValues=carMap.values();
		for(Car c:carValues) {
			c.print();
		}
		
	}

}
