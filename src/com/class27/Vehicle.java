package com.class27;

public interface Vehicle {

	static int wheels=4;
	
	void changeGear(int a);
	void speed(int b);
	void breaks(boolean a);
	
}
 class Car implements  Vehicle, Auto{

	 
	@Override
	public void changeGear(int a) {
		System.out.println("whells="+wheels+" "+a);
		
	}

	@Override
	public void speed(int abc) {
		this.changeGear(7);
		System.out.println(abc);
		
	}

	@Override
	public void breaks(boolean a) {
		System.out.println("True");
	}

	@Override
	public void IsAuto() {
		// TODO Auto-generated method stub
		
	}

	
	 
 } 
 interface Auto{
	 void IsAuto();
 }
 