package com.class14;

public class PrimeNumber {

	public static void main(String[] args) {
		int num=13;
		boolean flag=false;
		
		
		for(int i=2; i<num/2;  i++) {
			if(num%i==0) {
				flag=true;
				
				System.out.println(num+" is not a prime number");
				break;
			
			
		}
		}if(!flag) {
			System.out.println(num+ " is  a prime number");
		}
		
		}
}
