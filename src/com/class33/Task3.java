package com.class33;

import java.util.*;

public class Task3 {

	public static void main(String[] args) {
		Map<String,String>countries=new HashMap<>();
	countries.put("Turkey","Ankara");
//		countries.put("Austria","Vienna");
//		countries.put("Cuba","Havana");
//		countries.put("Germany","Berlin");
//		countries.put("Spain","Madrid");
		
	
	
	
	
		Set<String>state=countries.keySet();
		for(String str:state) {
			if(!str.isEmpty()) {
				System.out.print(str+" ");
			}else {
				System.out.println("It is empty");
			}
			//System.out.print(str+" ");
			
		}
		 
//		System.out.println(countries);
//		//Return a set
//		Set<String>state=countries.keySet();
//		for(String str:state) {
//			System.out.print(str+" ");
//			
//		}
//		
//		Iterator<String>states=state.iterator();
//		while(states.hasNext()) {
//			System.out.print(states.next()+" ");
//		}
//		System.out.println(" ");
//		Collection<String>value=countries.values();
//		for (String val: value) {
//			System.out.print(val+", ");
//		}System.out.println();
//		
//		
//		Iterator<String> it=value.iterator();
//		while(it.hasNext()) {
//			System.out.print(it.next()+", ");
//		}
	}

}
