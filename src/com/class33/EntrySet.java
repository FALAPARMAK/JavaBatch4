package com.class33;

import java.security.KeyStore.Entry;
import java.util.*;

public class EntrySet {

	public static void main(String[] args) {

		Map<String, Integer> classroomMap = new LinkedHashMap<>();
		classroomMap.put("Table", 20);
		classroomMap.put("Chair", 60);
		classroomMap.put("Screen", 3);
		classroomMap.put("Student", 60);
		classroomMap.put("Instructor", 3);

		System.out.println(classroomMap);
		for(Map.Entry<String, Integer>entry:classroomMap.entrySet()) {
			
			System.out.println(entry.equals(2));//True ,False
			
			System.out.println(entry.getKey()+"= "+entry.getValue());
		
		}
		System.out.println(classroomMap.containsKey("Table"));//True ,False// containsKey();
		
		System.out.println("//////////////////////////");
		
		Iterator<Map.Entry<String, Integer>> it=classroomMap.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry<String, Integer>me=it.next();
			System.out.println(me.getKey()+"= "+me.getValue());
		}
	}

}
