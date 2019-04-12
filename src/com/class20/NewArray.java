package com.class20;

public class NewArray {

	public static void main(String[] args) {
		
		NewArray obj=new NewArray();
		String [] Array =obj.GetWord("Hello Syntax Students");
		
		for(int i=0; i<Array.length ; i++) {
			System.out.println(Array[i]);
		}
			
		}
	
	
		
	
	String []  GetWord(String str) {
		
		String [] words=str.split(" ");	
		return words;
		
		
		
		

	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
