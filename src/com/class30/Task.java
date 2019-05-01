package com.class30;

import java.util.ArrayList;

public class Task {

	public static void main(String[] args) {
		/*
		 * Create a generic ArrayList that will store 5 names into it. Find out whether
		 * the given ArrayList is empty or not? Check whether the specific name is
		 * present in an ArrayList or not? Find the size of your arrayList and print all
		 * values from that
		 * 
		 */

		ArrayList<String> name=new ArrayList<String>();
		
		name.add("John");
		name.add("John");
		name.add("John");
		name.add("John");
		name.add("John");
		name.set(2, "Tonny");
		
		System.out.println(name.isEmpty());
		System.out.println(name.contains("Anna"));
		System.out.println(name.size());
		for(String n:name) {
			System.out.println(n);
		}
		
	}

}
