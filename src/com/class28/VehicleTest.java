package com.class28;

public class VehicleTest {

	public static void main(String[] args) {
		
		Car cc=new BMW("bmw");
		cc.drive();
		cc.start();
		cc.stop();
		Vehicle.displayTotalVehicles();//static we call class name
		
System.out.println(Vehicle.vehicleCount);
		
		new BMW("bmv");
		new Toyota("toyota");
		System.out.println(Vehicle.vehicleCount);	
	}

}
