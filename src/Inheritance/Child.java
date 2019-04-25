package Inheritance;

public class Child extends Parent {
	
	Child(){
		System.out.println("I am from child class");
	}

	public static void main(String[] args) {
		Parent p=new Parent();//only from parent class
		Child c=new Child();// from parent and child class

	}

}
