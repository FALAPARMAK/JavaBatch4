package com.class7;

public class IncrementDecrement {

	public static void main(String[] args) {
		
		
		int x=1;
		
		x=x+1;
		System.out.println(x);
		
		int y=1;
		y+=1;
		System.out.println(y);
		
		
		int z=1;
		z++;
		System.out.println(z);
		
		int w=2;
		w++;
		System.out.println(w); 
		
		
		int v=10;
		v--;
		System.out.println(v);
		
		
		int a=10;//11 11
		
		int b=++a;//preincrement = first increment-->assign
		
		
		int c=10;
		int d=c++;//postincrement= first assign __>increment
		
		System.out.println("Value of d is " + d);//10
		System.out.println("Value of c is "+ c);//11
		
		int q=100;
		int e=q--;
		
		System.out.println("Value of e is " + e);//100
		System.out.println("Value of q is " + q);//99
		
		int h=50;
		int g=--h;//first decrement
		
		System.out.println("Value of h is " + h);//49
		System.out.println("Value of g is " + g);//49
		
		
		int n=10;
		int m=--n;
		System.out.println(n);//11-9-9
		System.out.println(m);//10-10-9

	}

}
