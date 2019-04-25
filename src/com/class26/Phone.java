package com.class26;

public class Phone {
	
	public void makeCall() {
		System.out.println("Can make a  call");
	}
	public void hasCamera() {
		System.out.println("Has  camera");
	}

}

class iPhone extends Phone{
	
	public void makeCall() {
		System.out.println("Can make a face time");
		
	}
	public void hasCamera() {
		System.out.println("Has dual HD camera");
	}
}
class Nokia extends Phone{
	public void cannotBreak() {
		System.out.println("Nokia phones are unbreak");
	}
	
}
class Samsung extends Phone{
	public void hasCamera() {
		System.out.println("Has 3 lens  camera");
	}
}