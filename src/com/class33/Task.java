package com.class33;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Task {

	public static void main(String[] args) {
		List <String >list=new ArrayList<String>();
		list.add("John");
		list.add("James");
		list.add("Jane");
		list.add("Jasmine");
		list.add("Jane");
		list.add("James");
		HashSet <String >alist=new HashSet<String>(list);
		System.out.println(alist);
		
		
		//Using AddAll
		Set<String>noDublicate=new TreeSet<>();
		noDublicate.addAll(list);
		System.out.println(list);
		

	}

}
