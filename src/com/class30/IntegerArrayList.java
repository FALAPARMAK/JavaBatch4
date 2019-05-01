package com.class30;

import java.util.ArrayList;

public class IntegerArrayList {

	public static void main(String[] args) {
		
		ArrayList<Integer>numbers=new ArrayList<Integer>();
		numbers.add(10);
		numbers.add(50);
		numbers.add(100);
		numbers.add(200);
		
		numbers.set(2, 3333);
		
		for(Integer num:numbers) {//AutoUnboxed
			System.out.println(num);
		}
		

	}

}
