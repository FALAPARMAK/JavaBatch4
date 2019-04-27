package com.class28;

public abstract class Vehicle {
	
	static int vehicleCount;
	Vehicle(){
		vehicleCount++;
	}
//public static abstract void gps(); cannot have abstract methods as a static (cannot override static)
//private abstract void speed(); cannot be private(dont part of inheritance)
//public abstract final void break(); cannot have abstract method as final(cannot override)
	public abstract void start();
	public abstract void drive();
	public void stop () {
		System.out.println("by pressing break");
	}
	public static void displayTotalVehicles() {
		System.out.println("total vehicles we build = "+vehicleCount);
	}
}	
	abstract class Car extends Vehicle{
		/*by default compiler will create a default constr. and by default inside the child cons.
		 * we call a parent class constructor
		 * BMW(){
		 * super()
		 * }
;		 */
		
		
		public String make;//Instance variables allowed in the abstract class
		Car(String make){//we cannot create an object of abstract
			this.make=make;
		}
	}
 class BMW extends Car{

		BMW(String make) {
		super(make);
		
	}

		@Override
		public void start() {
			System.out.println("BMW car starts remote");
			
		}

		@Override
		public void drive() {
			System.out.println("BMW car drives fast");
			
		}
		
	}
	class Toyota extends Car{

		Toyota(String make) {
			super(make);
			
		}

		@Override
		public void start() {
			System.out.println("Toyota car starts with push button");
			
		}

		@Override
		public void drive() {
			System.out.println("Toyota car drives safe");
			
		}
		
	}

