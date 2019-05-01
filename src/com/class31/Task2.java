package com.class31;

import java.util.ArrayList;
import java.util.Iterator;

public class Task2 {

	public static void main(String[] args) {
	ArrayList<String>words=new ArrayList<String>();
	
	
	words.add("table");
	words.add("apple");
	words.add("book");
	words.add("home");
	words.add("water");
	
	
	Iterator<String>iterator=words.iterator();
	 
	while(iterator.hasNext()) {
		String word=iterator.next();
		if(word.endsWith("e")) {
			iterator.remove();
		}
	}
	System.out.println(words);
}

	}


