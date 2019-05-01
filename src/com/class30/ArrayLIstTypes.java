package com.class30;

import java.util.ArrayList;

public class ArrayLIstTypes {

	public static void main(String[] args) {
		// generic Array that stores only String object
		ArrayList<String> name = new ArrayList<String>();

		name.add("John");
		name.add("John");
		name.add("John");
		name.add("John");
		name.add("John");
        //names.add(123);
		
		//nongeneric arrayList we can store different types of Objects
		ArrayList alist=new ArrayList();
		alist.add(100);
		alist.add(100.10);
		alist.add('a');
		alist.add(true);
		alist.add("Str");
		
		for(Object values: alist) {
			System.out.println(values);
		}
		
		ArrayList<Boolean> booleanList=new ArrayList<Boolean>();
		 booleanList.add(true);
		 booleanList.add(false);
		
		 for(Object val: booleanList) {
				System.out.println(val);
			}
		 
		
	}

}
