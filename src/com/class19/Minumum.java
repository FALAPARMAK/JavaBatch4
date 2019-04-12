package com.class19;

public class Minumum {
	
	
	 //int min=x[0];//
	//int min =Integer.MAX_VALUE;

	
	
	static int minOfValues(int [] x) {
		int min =x[0];
		 for(int y:x) {
			 if(y<min) {
				min=y; 
			 }
		 }
		return min;
		
	
			
}
	
	static int maxOfValues(int [] x) {
		int max=x[0];
		for(int y:x) {
			if(y>max) {
				max=y;
			}
		}
	return max;
}}