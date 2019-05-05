package com.class32;

import java.util.ArrayList;
import java.util.Collections;

public class Task {
	/*
	 *  Create an ArrayList of Strings and using Collections class sort the values
	 * of that ArrayList.
	 * 
	 */
	public static void main(String[] args) {
		
		
	ArrayList<String>list=new ArrayList<>();
	
	list.add("Yellow");
	list.add("Blue");
	list.add("Green");
	list.add("Black");
	list.add("Red");
	

	System.out.println("Collection before sorting "+list);
	Collections.sort(list);
	System.out.println("Collection after sorting "+list);
	
	

}
}