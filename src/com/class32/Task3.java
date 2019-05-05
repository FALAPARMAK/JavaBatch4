package com.class32;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Task3 {

	public static void main(String[] args) {
		/*Create an HashSet of cities and add duplicates into it.
       Retrieve all values from hashset in 2 different ways.
       Retrieve all values in alphabetical order.
		 * 
		 */

		
		HashSet<String>hsett=new HashSet<>();
		
		hsett.add("Plano");
		hsett.add("Garland");
		hsett.add("Plano");
		hsett.add("Eullues");
		hsett.add("Arlington");
		System.out.println(hsett);
		
		//Convert Hashset collection in to the List COLLECTION
		List<String>str=new ArrayList<String>(hsett);
		Collections.sort(str);
		System.out.println(str);
		
		for(String s:str) {
			System.out.println(s);
		}
		System.out.println("--------Using iterator----------");
		Iterator<String>st=str.iterator();
		
		while(st.hasNext()) {
			System.out.println(st.next());
		}
	}

}
