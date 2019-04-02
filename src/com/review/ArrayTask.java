package com.review;

public class ArrayTask {

	public static void main(String[] args) {
		
		
	int [][]arr= {{1,2,3},
			      {4,5,6,9},
			     {7,8}
			      
	         };
		System.out.println(arr.length);
		System.out.println(arr[0].length);
		System.out.println(arr[1].length);
		System.out.println(arr[2].length);
		
		
	for(int i=0; i<arr.length; i++) {
		System.out.print(arr[i].length+",");
	}
	System.out.println("----------------------------");
	
	for(int[] innerArray: arr) {
		for(int data :innerArray) {
			System.out.print(data);
		}
	}
	
	
	
	
		
		
		

	}

}
