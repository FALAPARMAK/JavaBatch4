package com.class35;

import java.util.*;

public class Task2 {

	public static void main(String[] args) {
		
		List<Exception> exceptionList=getlist();
		System.out.println(exceptionList.size());
		
		for(Exception singleException:exceptionList) {
			System.out.println(singleException.getMessage());
		}
	}
		
	
	
	
		public static  List<Exception> getlist(){
			List<Exception>list=new ArrayList<>();//List olmaz o interface object olusturamayiz
			
			
			try {
				System.out.println(10/0);
			}catch(ArithmeticException ae) {
				list.add(ae);
				//2 try catch for NullPointerExceeption
			}String str=null;
			
			try {
				System.out.println(str.length());
			}catch(NullPointerException npe){
				list.add(npe);
			}
			//
			
			//
			return list;
		}
		
		
}
