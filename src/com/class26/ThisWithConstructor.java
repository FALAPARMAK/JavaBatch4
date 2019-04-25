package com.class26;

public class ThisWithConstructor {

	// this() calls current class constructor --->costructor chaining (zincirleme)
	 ThisWithConstructor() {
		System.out.println("I have no parameters");
	}
	 
	                     //hello
	 ThisWithConstructor(String str) {
		   this();
			System.out.println("I have 1 string parameters "+ str);
		}
	 
	                          //hello      bye
	 ThisWithConstructor(String str1,String str2 ) {
		 this(str1);
			System.out.println("I have 2 string  parameters "+str1+str2);
		}
	 
	 public static void main(String[] args) {
//		 ThisWithConstructor obj1=new ThisWithConstructor();
//		 ThisWithConstructor obj2=new ThisWithConstructor("hello");
		 ThisWithConstructor obj3=new ThisWithConstructor("hello ","bye");
	}
}
