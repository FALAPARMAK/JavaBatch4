package com.class25;

public class FinalKeyword {

	public static final String name = "Syntax";

	public static void main(String[] args) {
		// Final can be used in 3 place
		// 1.variables -------------we cannot change their value
		// 2. final methods-------- we can not override final methods
		// 3.classes ---------------we can not create a child of a final class

		final String str = "Hello";
		// name="School"; you can not change

	}

	public final void hello() {
		System.out.println("Hello from parent class");
	}

}

class ChildOfFinal extends FinalKeyword {
	// cannot override final method
//	public void hello() {
//		System.out.println("Hello from parent class");
//	}
}