package com.class28;

public interface TakesScreenshot {
	String fileExtension = "hjk"; // by default this is
	// public static final variable and it must to be initialized

	void takesScreenShot();

//from java 8 we can have defined methods in interface:static or default

	public static void m1() {
		System.out.println("Static m1 method");
	}
	
	default void m2() {
		System.out.println("default m2 method");
	}
}
