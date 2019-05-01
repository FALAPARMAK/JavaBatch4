package com.class31;

import java.util.ArrayList;

public class Task3 {

	public static void main(String[] args) {
		ArrayList<String>drinks=new ArrayList<String>();

		drinks.add("tea");
		drinks.add("milk");
		drinks.add("soda");
		
		for(int i=0; i<drinks.size(); i++) {
			String drink=drinks.get(i);
			if(drink.contains("e") || drink.contains("a")) {
				drinks.set(i," water");
				
			}
		}
		System.out.println(drinks);
	}

}
