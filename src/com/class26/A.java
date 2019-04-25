package com.class26;

public class A {
	
	
	 public static void main(String[] args) {
			A obj=new A();
			obj.Method();
			obj.Method("yes");
		}

	
	 
	 
	 final void  Method() {
		System.out.println("Hello");
	}
	 
	 final void Method(String str) {
		 System.out.println("Overload");
	 }
	 
	 
//	 class B extends A{
//		 final void Method() {
//			 
//		 }
//		 //WE CANNOT override final method
//	 }
//	 
	
}
