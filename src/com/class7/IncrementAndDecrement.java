package com.class7;

public class IncrementAndDecrement {

	public static void main(String[] args) {
		
		// post icrement
		
		//a++                 a--
		
		
		int a=299;
		int b=a++;//first assign --> increment  --> increment(int b=a; a=a+1)
		
		System.out.println(a);
		System.out.println(b);//299
		
		//& post decrement
		
		
		int z=10;
		int c=z--;// first assign __> decrement (int c=z;  z=z-1)
		System.out.println(z);
		System.out.println(c);//10 
		
		int i=5;
		int o=--i;
		
		System.out.println(i);
		
		System.out.println(o);

	}

}
