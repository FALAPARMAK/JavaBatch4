package com.class32;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetIntro {

	public static void main(String[] args) {
		// Set<String> hs = new LinkedHashSet<String>();
		HashSet<Integer>hset=new HashSet<>(); 
		hset.add(12);
		hset.add(32); 
		hset.add(52);
		
		System.out.println(hset.size());
		//Set does not keep the order
		System.out.println(hset);
		hset.clear();
		System.out.println(hset);
		System.out.println(hset.contains(32));
		//Set Interface does not allow duplicates
		hset.add(12);
		hset.add(32);
		System.out.println(hset.size());
		//to retrieve all values from hashset
		//1. way advance loop
		System.out.println("-----using advence loop-------");
		for(int num:hset) {
			System.out.println(num);
		}//another wat iterator
		System.out.println("------using iterator-------");
        Iterator<Integer>it= hset.iterator();
        while(it.hasNext()) {
        	System.out.println(it.next());
        	
        	
        }
		
	}

}
