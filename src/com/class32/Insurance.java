package com.class32;

public abstract class Insurance {
	/*
	 * Create a class Insurance that will have an attribute as insuranceName and
	 * unimplemented behaviour as getQuote and cancelInsurance. Create 3 subclasses
	 * Car, Pet, Health. Car class has it’s own attribute as carModel and Class Pet
	 * has petType attribute. Create 3 objects of the sub classes and store them in
	 * ArrayList. Using 1 reference variable access methods from different classes.
	 */
	String insuranceName;
	
	public abstract void getQuote();
	public abstract void cancelInsurance();
	
}
class Car extends Insurance{
	

	public Car(String name) {
		super();
		this.insuranceName=name;
		
	}

	@Override
	public void getQuote() {
		System.out.println(insuranceName+" insurance has 2 types");
		
	}

	@Override
	public void cancelInsurance() {
		System.out.println(insuranceName+ " can be cancel");
		
	}
	
}
class Pet extends Insurance{
	

	public Pet(String petType) {
		super();
		this.insuranceName=petType;
	}

	@Override
	public void getQuote() {
		System.out.println(insuranceName+" insuranse has 3 types ");
		
	}

	@Override
	public void cancelInsurance() {
		System.out.println(insuranceName+" can be cancel  in the 10 days");
		
	}
}class Health extends Insurance{
	

	public Health(String name) {
		super();
		this.insuranceName=name;
	}

	@Override
	public void getQuote() {
		System.out.println(insuranceName+"insurance has 4 types");
		
	}

	@Override
	public void cancelInsurance() {
		System.out.println(insuranceName+"can be cancel in the 15 days" );
		
	}}