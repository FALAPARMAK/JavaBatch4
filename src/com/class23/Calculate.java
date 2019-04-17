package com.class23;

public class Calculate {
	public void areaOfSquare(int a) {
		int areaOfSquare=a*a;
		System.out.println(areaOfSquare);
	}
	public void areaRectangle(int a, int b) {
		int areaOfRectangle=(a*b);
		System.out.println(areaOfRectangle);
	}
	public void areaOfCube(int a) {
		int areaOfCube=6*(a*a);
		System.out.println(areaOfCube);
	}

	
	
	public static void main(String[] args) {
		Calculate obj= new Calculate();
		obj.areaOfSquare(5);
		obj.areaRectangle(10, 6);
		obj.areaOfCube(6);
	}

}