package com.class32;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsClass {

	public static void main(String[] args) {
		ArrayList<Integer>integerList=new ArrayList<>();
		integerList.add(90);
		integerList.add(30);
		integerList.add(190);
		integerList.add(100);
		
		System.out.println("Collection before sorting "+integerList);
		Collections.sort(integerList);//class that works with collections
		System.out.println("Collection after sorting "+integerList);
		
		
		int []integerArray= {12,34,78,3};
		Arrays.sort(integerArray);//This class contains various methods for 
		System.out.println("Array after sorting"); 
		
		for(int num:integerArray) {
			System.out.print(num+" ");
		}
	}
	

}
