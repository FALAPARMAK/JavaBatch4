package com.class34;

import java.util.HashMap;
import java.util.*;

public class Task2 {

	public static void main(String[] args) {
		/*
		 * Write a program to check which employee gets highest salary use hashmap
		 * employee name as key and salary amount as the value. Output example: John
		 * Smith=100000.
		 * 
		 */

		Map<String,Integer>employee=new HashMap<>();
		employee.put("John", 100000);
		employee.put("Sara", 90000);
		employee.put("Sam", 110000);
		employee.put("Tom", 80000);
		
		System.out.println(employee);
//		
//		for(Map.Entry<String, Integer>emp:employee.entrySet()) {
//			String str=emp.getKey()+": "+emp.getValue();
//			System.out.println(str);
//		}
		int max=Integer.MIN_VALUE;
		for(Integer num:employee.values()) {
			if(num>max) {
				max=num;
			}
		}
		System.out.println("Highest salary "+max+" belong to ");
		
	}

}
