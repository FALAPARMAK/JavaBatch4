package com.class30;

import java.util.ArrayList;

public class NonGeneric {

	public static void main(String[] args) {
		ArrayList<String>city=new ArrayList<String>();
		city.add("Dallas");
		city.add("Arlington");
		city.add("Plano");
		

		for(int i=0; i<city.size(); i++) {
			System.out.println(city.get(i));
		}
		System.out.println("---------------------");
		for(String str:city) {
			System.out.println(str);
		}
		
		System.out.println("---------------------");
		int i=0;
		while(city.size()>i){
			System.out.println(city.get(i));
			i++;
		}
		
	}

} 
