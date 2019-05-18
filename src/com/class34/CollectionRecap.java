package com.class34;

import java.util.*;

public class CollectionRecap {

	public static void main(String[] args) {
		
		Set<String>set=new TreeSet<>();//ArrayList
		set.add("java");
		set.add("is");
		set.add("fun");
		set.add("and");
		set.add("logical based");		
		System.out.println(set);
		
		
		
		Map<Integer,String>map=new 	TreeMap<>();
		map.put(1, "A");
		map.put(2, "b");
		map.put(3, "A");
		//map.put(null, "A");
		map.put(4, null);
		map.put(1, "E");
		
		System.out.println(map);
		

		Map<Integer,String>map1=new Hashtable<>();
		map.put(1, "A");
		map.put(2, "b");
		map.put(3, "A");
	}

}
