package com.class30;

import java.util.ArrayList;

public class Arr {

	public static void main(String[] args) {
		/*
		 * retrieve an element from a particular position of an ArrayList
		 * 
		 * get() method returns an element from a specified position of an ArrayList.
		 * This method takes index of the element as an argument.
		 * 
		 * Add the six Elements to the list 111 222 333 444 555 666
		 * 
		 * by using get method call get 1, 3, 5
		 */
		ArrayList<Integer> num = new ArrayList<Integer>();
		
		System.out.println(num.isEmpty());
		num.add(2);
		System.out.println(num.isEmpty());
		
		num.add(111);
		num.add(222);
		num.add(333);
		num.add(444);
		num.add(555);
		num.add(666);
		
		System.out.println(num.get(5));
		num.remove(1);
		
		System.out.println(num.clone());//for all elements   you can write only (num)
		num.clear();
		System.out.println(num);
		
		
	}

}
