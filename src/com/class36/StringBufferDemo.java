package com.class36;

public class StringBufferDemo {

	public static void main(String[] args) {
                                                    // mutable object.Can changable
		StringBuffer sb = new StringBuffer("Hello");// No need create new object 
		sb.deleteCharAt(0);
		System.out.println(sb);
		
		String str="Good morning ";
	  str.concat("John");//you can create a new object-->str=str.concat("John");
      System.out.println(str);
      System.out.println("-------------");
      
      StringBuffer str1 = new StringBuffer("Good Morning ");
      str1.append("John");
      
      System.out.println(str1);
      
      
	}

}
