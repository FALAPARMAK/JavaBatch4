package com.class30;

import java.util.ArrayList;
import java.util.Iterator;

public class Taskk {

	public static void main(String[] args) {
		ArrayList<String>cars=new ArrayList<String>();
		cars.add("Toyota");
		cars.add("BMW");
		cars.add("Lexus");
		cars.add("Nissan");
		System.out.println("-------For loop-----------");
		for(int i=0; i<cars.size(); i++) {
			System.out.println(cars.get(i));
		}
		System.out.println("---------Advenced Loop------"); 
		
      for(Object str:cars) {
    	 
      } System.out.println(cars);
      
      System.out.println("-------Using iterator----------");
      
      Iterator it=cars.iterator();
      
      while(it.hasNext()) {
    	 System.out.println( it.next());
      }
      System.out.println("----------while loop--------");
      int i=0;
      while(cars.size()>i) {
    	  String car=cars.get(i);
    	  System.out.println(car);
    	  i++;
      }
	}

}
