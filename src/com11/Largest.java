package com11;

public class Largest {

	public static void main(String[] args) {
		
	int []  num	= {10,20,30,40,100,60};
		
	int large=0;	
		
	//for(int i:num)
	for(int i=0; i<num.length; i++) {
		if(num[i]> large) {
			large=num[i];
		}
	}
	
	System.out.println("The largest number is:"+large);
	
	
	int [] number= {2,5,6,3,7};
	
	int max=0;
	
	for(int i :number) {
		if(i>max) {
			max=i;
		}
		
	}
	System.out.println("The largest number is:"+ max);
	

	}

}
