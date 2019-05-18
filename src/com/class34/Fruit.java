package com.class34;

import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class Fruit {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();

		map.put("Apple", 5);
		map.put("Orange", 3);
		map.put("Kiwi", 7);
		map.put("Apple", 10);
		
	 	Set<String>str=map.keySet();
		
		for(String fru:str) {
			System.out.println(fru);
		}
		System.out.println("--------keys with iterator----------");
		Iterator<String>it=str.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		System.out.println("----------values -------------------");
		Collection<Integer>coll=map.values();
		
		for(Integer ii:coll) {
			System.out.println(ii);
		}
		System.out.println("----------values with iterator -------------------");
		Iterator<Integer>ii=map.values().iterator();
		
		while(ii.hasNext()) {
			System.out.println(ii.next());
		}
		
		
	}

}
