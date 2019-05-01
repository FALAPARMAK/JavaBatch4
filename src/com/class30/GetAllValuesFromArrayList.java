package com.class30;

import java.util.ArrayList;
import java.util.Iterator;

public class GetAllValuesFromArrayList {

	public static void main(String[] args) {
		ArrayList<String> name = new ArrayList<String>();

		name.add("Jack");
		name.add("John");
		name.add("Sam");
		name.add("Nick");
		System.out.println("----------1. way  using for----------");
		//1. way
		
		for(int i=0; i<name.size(); i++ ) {
			System.out.println(name.get(i));
		}
		System.out.println("----------2. way advence loop----------");
		//2. way
		
		for(Object names:name) {
			System.out.println(names);
		}
		System.out.println("----------3. way-  using iterator---------");
		Iterator<String>it=name.iterator();
		//boolean check=it.hasNext();
		
		
		while(it.hasNext()) {
			System.out.println(it.next());
			
		}
		
	}}		


