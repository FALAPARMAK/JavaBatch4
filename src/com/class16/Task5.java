package com.class16;

public class Task5 {
	

	
	public static void main(String [] args) {
		/*create a method that shows you all the vowals in a string
	     * output: should only show these characters a,e,i,o,u,A,E,I,O,U,
	     * this method can have any string value you put in, but must return
	     * all the vowals within the string */
		
	 Task5 word=new Task5();
	  
	  word.vowals();
		
	}void vowals(){
		String w="HalimeBETUL";
		String s=w.replaceAll("[^(aA,eE,oO,iI,uU)]","");
		System.out.println(s);
		
	}

}
