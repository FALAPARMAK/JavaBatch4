package com.class8;

public class Task {

	public static void main(String[] args) {
		
		
		
		 for(int i=1;  i<=100; i++) {
			 System.out.println(i);
		 }
		
		for(int a=100;  a>=1;  a--) {
			System.out.println(a);
		}
		
		for(int b=1; b<=20;  b+=2) {
			System.out.println(b);
		}
		for(int c=1; c<=20; c++ ) {
			if(c%2!=0) {
				System.out.println(c);	
			}
		}
		for(int x =20;  x>=1; x-=2) {
			System.out.println(x);
		}
		
		for(int w=20; w<=50; w+=2 ) {//1 way
			System.out.println(w);
		}
		for(int y=20; y<=50; y++) {//2. way
			if(y%2==0) {
				System.out.println(y);	
			}
		}for(int z=21; z<=50; z+=2) {//odd number 1. way
			System.out.println(z);
		}
		for(int z=20; z<=50; z++) {//odd number 2. way
			if(z%2==1) {
				System.out.println(z);
			}
		}
		
	}

}
