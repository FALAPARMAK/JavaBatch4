package com.class19;

public class Calculator1 {
	

	 int sum(int a, int b, int c) {
		return(a+b+c);
	}
	 
	 
	 
	int avarage(int a, int b, int c) {
		return((a+b+c)/3);
	}
	
	
	
	 int min(int a, int b, int c){
		int min=0;
		if(a<b && a<c) {
			min=a;
		}else if(b<a && b<c) {
			min=b;
		}else {
			min=c;
		}return min;
	}
	 
	 
	 int max(int a,int b, int c) {
		 int max=0;
		 if(a>b && a>c) {
			 max=a;
		 }else if(b>a && b>c) {
			 max=b;
		 }else {
			 max=c;
		 }return max;
	 }
}

