package com.class34;

import java.util.*;

public class MapReview {

	public static void main(String[] args) {
		//create a map of grocery products
		
		Map<String,Integer>groceryMap=new LinkedHashMap<>();
		groceryMap.put("milk", 1);
		groceryMap.put("bresd", 2);
		groceryMap.put("eggs" ,3);
		groceryMap.put("coffee", 4);
		groceryMap.put("potato", 5);
		groceryMap.put("cookies", 6);
		
		
		
		System.out.println(groceryMap);
		
		if(groceryMap.isEmpty()) {
			System.out.println( "It is empty");
		}else {
			System.out.println(groceryMap);
		}
		
		
		
//		
//		groceryMap.put("Cheese",2);
//		System.out.println(groceryMap.size());
//		groceryMap.replace("Eggs", 1);
//		System.out.println(groceryMap);
//		
//		groceryMap.remove("Cheese");
//		System.out.println(groceryMap);
		
		Set<String>keySet=groceryMap.keySet();//retriev key
		for(String key:keySet) {
			System.out.println("Key is "+key+" and value is "+groceryMap.get(key));
		}
		
		
		Iterator<String>keyIt=keySet.iterator();
		while(keyIt.hasNext()) {
			String key=keyIt.next();
			System.out.println(key+":"+groceryMap.get(key));
		}
		
		groceryMap.keySet().iterator();
		System.out.println("--------------- for each loop");
	//retrieving all values using
		
		Collection<Integer>valCollection=groceryMap.values();//  Alttaki ile ayni sonuc
		for(Integer value:valCollection) {//if you wanna store use this type
			System.out.println(value);
		}
	for(Integer value:groceryMap.values()) {
			System.out.println(value);
		}
		System.out.println("-------------using iterator");
		Iterator<Integer>valueIt=groceryMap.values().iterator();
		while(valueIt.hasNext()) {
			System.out.println(valueIt.next());
		}
		
		//retrieving all key+values using entrySet();
		
		for(Map.Entry<String, Integer>entry:groceryMap.entrySet()) {
			String mapValue=entry.getKey()+entry.getValue();
			System.out.println(mapValue);
		}
		///map-->using entrySet _-->Set
		///any collection has iterator method-->Iterator object
		Iterator<Map.Entry<String, Integer>>it=groceryMap.entrySet().iterator();
		while(it.hasNext()) {
		Map.Entry entry=it.next();
		String valueFromMap=entry.getKey()+"and value is"+entry.getValue();
		System.out.println(valueFromMap);
		}
	}

}
