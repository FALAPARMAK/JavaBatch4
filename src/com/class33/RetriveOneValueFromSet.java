package com.class33;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class RetriveOneValueFromSet {

	public static void main(String[] args) {

		Set<String> cars = new LinkedHashSet<>();
		cars.add("Toyota");
		cars.add("Honda");
		cars.add("Audi");
		cars.add("BMW");

		// 1. way we convert to the arraylist
		// a way : add collection into ArrayList
		List<String> list = new ArrayList<>(cars);
		System.out.println("List collection : " + list);
		System.out.println(list.get(2));
		//b way
		List<String> list2 = new ArrayList<>();
		list2.addAll(cars);
		System.out.println("List collection 2:"+list2);
		
		//2. way we convert collection to Array
		Object[] array=cars.toArray();
		System.out.println(array[1]);
		
	}

}
