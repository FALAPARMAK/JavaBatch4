package com.class17;

public class Task {

	public static void main(String[] args) {

		// Create a method that will take 2 parameters
		// as a numbers and prints which number is larger.

		// Create a method that will take a number and
		// prints whether the number is even or odd.

		// Create a method that will print whether given String is palindrome or not.

		Task obj=new Task();
		obj.findLargest(2, 8);
		obj.odEvenNumber(9);
		obj.Paliondrome("dad");
		
		
	}
  void findLargest(int a,int b) {
	  if(a>b) {
		  System.out.println("a larger than b");
	  }else {
		  System.out.println("b larger than a");
	  }
	  
  }
	
	void odEvenNumber(int a) {
		if(a%2==0) {
			System.out.println("a is  even number");
		}else {
			System.out.println("a is odd number");
		}
	}
	void Paliondrome(String word) {
		String reverse="";
		for(int a=word.length()-1; a>0; a--) {
			reverse+=word.charAt(a);
		}if(reverse.equals(word)) {
			
			System.out.println(word+" is paliondrome");
		}else {
			System.out.println(word+" is not paliondrome");
		}
		
	}
	
	
	
	
	
	
	
	
	
}
