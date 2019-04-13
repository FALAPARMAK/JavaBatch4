package com.class22;

public class ConstructorsTypes {
	
	ConstructorsTypes(){
		System.out.println("I am a constructor with no parameters");
	}
	ConstructorsTypes(String str){//str is a local variable to a constructor
		System.out.println("I am a constructor with 1 parameter "+str);
	}
	
	ConstructorsTypes(int a, String str){
		System.out.println("I am a constructor with 2 parameters "+ a+" and "+ str);
	}

	public static void main(String[] args) {
		ConstructorsTypes obj=new ConstructorsTypes();
		ConstructorsTypes obj1=new ConstructorsTypes("String");
		ConstructorsTypes obj2=new ConstructorsTypes(123,"String");
	}
}
