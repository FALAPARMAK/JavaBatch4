package com.class31;

import java.util.ArrayList;
import java.util.Iterator;

public class Recap {

	public static void main(String[] args) {
	
		int a=10;
		int b=20;
		
		
		int [] array= {10,10,20,20};
		
		ArrayList<Integer>numbers=new ArrayList<Integer>();
		
		numbers.add(12);//comes from collection
		numbers.add(0,13);//specific to all list object
		
		System.out.println(numbers);
		System.out.println(numbers.size());
		numbers.add(0,14);
		System.out.println(numbers.size());
		System.out.println(numbers.get(2));//12
		
		numbers.set(1, 33);
		System.out.println(numbers.get(1));
		System.out.println(numbers.contains(33));
		//1. way using for loop
		
		for(int i=0; i<numbers.size(); i++) {
			System.out.print(numbers.get(i));
		}System.out.println("-------");
		
		//2. way using advanced for loop
		for(Object i:numbers) {
			System.out.print(i);
		}
		//3.way using iterator
		Iterator it=numbers.iterator();
		// hasNext();      remove();
		while(it.hasNext()) {
			it.next();
			System.out.println(numbers);
		}
		//4.way using while loop
		int c=0;
		while(numbers.size()>c) {
			int myNum=numbers.get(c);
			System.out.println(myNum);
			c++;
		}
	}

}
