package com.review;

public class StringManuplation {

	public static void main(String[] args) {
		
		int sum=0;
		
		int arr [][]= {{1,2},{3,4},{5,6}};
		
		for(int i=0; i<=arr[2].length; i++) {
			System.out.print(arr[1][i]+",");
		 sum+=arr[2][i];
		 
		}
		System.out.println();
		System.out.println(sum);
		

	}	

}
