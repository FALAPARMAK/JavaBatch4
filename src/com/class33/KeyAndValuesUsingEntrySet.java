package com.class33;

import java.util.*;

public class KeyAndValuesUsingEntrySet {

	public static void main(String[] args) {
		// create a map to store user details
		Map<String,String>userDetailsMap=new TreeMap<>();//LinkedHashMap for order
		userDetailsMap.put("Name","Alex Smith");// 1 entry  Key=Name  value=Alex Smith
		userDetailsMap.put("Salary","90000");//2 entry
		userDetailsMap.put("Department","IT");//3 
		userDetailsMap.put("Title","Automation Tester");//4
		
		System.out.println(userDetailsMap);
		userDetailsMap.entrySet();//returns set of entries
		
		for(Map.Entry <String,String>entry:userDetailsMap.entrySet()) {
			System.out.print(entry.getKey()+" ");
			//System.out.print(entry.getKey()+" ");
			//System.out.println(entry.getKey()+":"+entry.getValue());
		}System.out.println("------Itrerator--------");
		Iterator<Map.Entry<String, String>>it=userDetailsMap.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry entry=it.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		
		
	}

}
