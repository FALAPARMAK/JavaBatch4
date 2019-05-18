package com.class34;

import java.util.*;

public class MapFruit {

	public static void main(String[] args) {
	
		Map<String,Integer>map=new HashMap<>();
		
		map.put("Apple",5);
		map.put("Orange",3);
		map.put("Kiwi",7);
		map.put("Apple",10);
		
	Set<Map.Entry<String,Integer>>fruitMap=map.entrySet();
	
	for(Map.Entry<String, Integer>fruits:fruitMap) {
		String str=fruits.getKey()+":"+fruits.getValue();
		System.out.println(str);
	}
		
	System.out.println("--------------------");
		Iterator<Map.Entry<String,Integer>>it=fruitMap.iterator();
		
		while(it.hasNext()) {
			Map.Entry<String, Integer>itt=it.next();
			System.out.println(itt);
		}
	
	
		
	}

}
