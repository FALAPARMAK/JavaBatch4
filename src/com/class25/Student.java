package com.class25;

public class Student {

	public void study() {
		System.out.println("Students must study");
	}
	
	protected void doHoHomeworh() {
		System.out.println("Students must do homework");
	}
	void attendClass(String str) {
		System.out.println("Students must attend classes");
	}
	//Private method cannot be overriding..Do not particifiate inharitance
	private void doResearch() {
		System.out.println("Student must research");
		
	}
}
