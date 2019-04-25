package Inheritance;

public class Parent {

	Parent(){
		System.out.println("I am from parent class");
	}
	
	
	String Reverse(String first) {
		String rev="";
		for(int i=first.length(); i>0; i--) {
			rev+=first.charAt(i);
		}
		return rev;
	}
	
}
