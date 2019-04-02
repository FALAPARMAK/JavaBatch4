package com.class8;

public class Sum {

	public static void main(String[] args) {
		
		int sum=0;
		
		for(int i=1; i<=5; i++) {
			sum=sum+i;
		}
		
		System.out.println(sum);//1 2 3 4 5 
		
		// 
		
		int Sum=0;
		
		for(int a=1; a<=100 ; a++) {
			if(a%2==0) {
				Sum=Sum+a;
			}
		}System.out.println(Sum);
		
		///
		
		int sumAll;
		
		for (int y=10; y<=50; y+=10) {
			sum=sum+ y;
		}
		System.out.println(sum);
				
 
	}

}
