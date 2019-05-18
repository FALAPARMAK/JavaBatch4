package com.class34;

import java.util.*;

public class PersonTest {

	public static void main(String[] args) {
	
		
	
	Map<Integer,Person>person=new HashMap<>();
	
	person.put(1, new Person("John","Snow",22,50000));
	person.put(2, new Person("Sam","Snow",32,70000));
	person.put(3, new Person("Tom","Snow",28,60000));
	person.put(4, new Person("Jane","snow",40,80000));
	
     Collection<Person>personValues=person.values();
     
     for(Person p:personValues) {
    	 p.print();
     }
	

	}

}
