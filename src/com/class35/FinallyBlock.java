package com.class35;

public class FinallyBlock {

	public static void main(String[] args) {
		int a=10;
		int b=0;
		try {
			System.out.println("Try block");
			System.out.println(a/b);
		}catch(ArithmeticException e) {
			System.out.println("Catch bloke");
		}finally {
			System.out.println("Finally block always execute");
		}
		System.out.println("-------------");
		try {
			System.out.println(a/b);
		}finally {
			System.out.println("Finally code");//There is excep. or no excep. doesnt matter
		}
		System.out.println("Continues code....");
		
	}

}
