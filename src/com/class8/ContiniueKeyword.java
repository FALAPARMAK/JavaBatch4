package com.class8;

public class ContiniueKeyword {

	public static void main(String[] args) {
		
		for(int i=0; i<5; i++) {
			if(i==2 || i==3) {//ifin icinde && kullanma.impossible
				continue;
			}
			System.out.println(i);
			System.out.println("Hi");
		}
		
		System.out.println("Hello");
		
		//I want to print number from 1 to 20 but skip those that divisible by3
		
		
		for(int a=1;a<=20; a++ ) {// 3 e bolunebilenleri atladi
			if(a%3==0) {
				continue;
			}
			System.out.println(a);
		}
		
		
		 
		
		

	}

}
