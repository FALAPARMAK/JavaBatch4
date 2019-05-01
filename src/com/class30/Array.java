package com.class30;

import java.util.ArrayList;
import java.util.Iterator;

public class Array {
public static void main(String[] args) {
	

	ArrayList<Integer>num=new ArrayList<Integer>();
	
	num.add(10);
	num.add(12);
	num.add(14);
	num.add(16);
	num.add(18);
	
	
	for(Integer n:num) {
		System.out.println(n);
	}
	
	for(int i=0; i<num.size(); i++) {
		System.out.println(num.get(i)); 
	}
	
	Iterator<Integer> it=num.iterator();
	
	
	
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	
	int i = 0;   
	while (num.size() > i) {
	 System.out.println(num.get(i)); 
	 i++;     
	 }
}
 
	
	

}