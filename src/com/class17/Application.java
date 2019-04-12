package com.class17;

import com.class17_2.ScannerMethod;

public class Application {

	public static void main(String[] args) {
		ScannerMethod scnMthd= new 	ScannerMethod();
		System.out.println(scnMthd.sum(125,150));
		
	}
	void example() {
		System.out.println("No return value and no parameters");
	}
	void example2(String name) {
		System.out.println("No return value but with parameter "+ name);
	}
    boolean example3() {
    	System.out.println("With return value and no parameters");
    	return true;
    }
    String example4(String name) {
    	System.out.println("No return value but with Parametre "+ name);
    	return name;
    }
    boolean example5(String name) {
    	System.out.println("No return value but with Parameter "+ name);
    	return false;
    }
    long example6(char name) {
    	System.out.println("No return value but with parameter "+ name);
    	return name;
    }
}
