package com.class29;

public interface Shape {

	void calculateArea(int num);
	void calculatePerimiter(int num);
	
	
}
class Circle implements Shape{

	@Override
	public void calculateArea(int num) {
		//int radius=12;
		double area=3.14*(num*num);
		System.out.println(area);
		
	}

	@Override
	public void calculatePerimiter(int num) {
		//int radius=12;
		double perimiter=2*(num*3.14);
		System.out.println(perimiter);
		
	}

	public void whoAmI() {
		System.out.println("I am a circle");
	}

	
}
class Square implements Shape{

	@Override
	public void calculateArea(int num) {
		//int side=12;
		double area=num*num;
		System.out.println(area);
		
	}

	@Override
	public void calculatePerimiter(int num) {
		//int side=12;
		double perimiter=4*num;
		System.out.println(perimiter);
	}
	
}