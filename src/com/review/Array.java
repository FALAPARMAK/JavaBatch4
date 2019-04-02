package com.review;

public class Array {

	public static void main(String[] args) {
		
		
		int [] arr= {1,2,3,4,5,6,7,8,9,10};
		
		
		
		
		int sum=0;
		
		
		for(int i=0; i<arr.length; i++) {
		sum=sum+arr[i];	// sum+=arr[i]
		
			
		}
		System.out.println(sum);
		//////////////
		
		
		int[] array= {1,2,3,4,5,6,7,8,9,10};
		
		boolean found=true;
		
		for(int i=0; i<array.length; i++) {
			if(array[i]==6) {
				found=true;
				break;
			}
		}
		
		if(found==true) {
			System.out.println("The array contains the value 6");
		}else {
			System.out.println("The array  dont contains the value 6");
		}
		
		
		
		
		
	}

}
