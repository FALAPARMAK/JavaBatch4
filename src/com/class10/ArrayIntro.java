package com.class10;

public class ArrayIntro {

	public static void main(String[] args) {
		
	int num;	
		
	num=10;//int num=10;   same data in array	
		
	int[] array1;//declare an array -->preferred way
	int [] array2;//declare an array
	int array3[];// declare an array     3 ways fine
		
		array1=new int[4];
		
		//assign value
		array1[0]=10;// initialize;  create an array
		array1[1]=20;
		array1[2]=30;
		array1[3]=40;
		
		//access values
		
		System.out.println(array1[3]);
		
		int[] numbers= new int[3];
		
		numbers[0]=5;
		numbers[1]=10;
		numbers[2]=15;
		//numbers[3]=20; no error during compilation but error during the run time
		
		
		System.out.println(numbers[2]);//Array index out of Bounds Exception
		System.out.println(numbers[2] +numbers[0]);//5+15=20
		
		String[] a= new String[3];
		a[0]="Hello";
		a[1]="Hi";
		a[2]="Bye";
		
		System.out.println(a[1] + " friends");
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
