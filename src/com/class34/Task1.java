package com.class34;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class Task1 {

	public static void main(String[] args) {

		/*
		 * 1.Create a Map from array of cities that will sort keys in alphabetical
		 * order. As a key store the name of the city and as a value store the length of
		 * the city name (Example: Paris=5, Moscow =6 etc..). If any city name is more
		 * than 7 characters remove that city ( use entrySet with Iterator ).
		 */

		String[] Array= {"Paris","Moscov","London","Washington"};
		
		Map<String,Integer> city=new LinkedHashMap<>();
		
		for(Map.Entry<String, Integer>ent:city.entrySet()) {
			String cities=ent.getKey()+": "+ent.getValue();
			System.out.println(cities);
		}
		
	Iterator<Map.Entry<String,Integer>> it=city.entrySet().iterator();
	while(it.hasNext()) {
		Map.Entry ent=it.next();
		System.out.println(ent.getKey()+": "+ent.getValue());
	}
	}

}
