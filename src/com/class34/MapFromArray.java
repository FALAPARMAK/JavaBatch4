package com.class34;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapFromArray {

	public static void main(String[] args) {
		
		String [] names= {"Mehmet","Asha","Amina","Omar","Siyar","Danny"};
		
		Map<Integer,String>nameMap=new LinkedHashMap<>();
		
		int key=1;
		for(String name:names) {
			nameMap.put(key, name);
			key++;
		}System.out.println(nameMap);
		//print key and values using entrySet (loop && iterator)
		
		
		//Map<Integer,String>nameMapp=new LinkedHashMap<>();
		
		for(Map.Entry<Integer,String>ent:nameMap.entrySet()) {
		String nam=ent.getKey()+":"+ent.getValue();
			System.out.print(nam);
		}
		System.out.println("------------------");
		Iterator<Map.Entry<Integer,String>>it=nameMap.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry ent=it.next();
			System.out.print(ent.getKey()+":"+ent.getValue());
		}
	}

}
