package com.class27;

public class PhoneTest {

	public static void main(String[] args) {
		//Phone p=new Phone();c.e cannot instantiate phone class because it is an abstract class
		
		Phone p= new iPhone();
		p.makeCall();
		p.sendText();
		p.unlockPhone();
		p.viewPictures();
		
		Phone ph=new Samsung();
		ph.makeCall();
		ph.sendText();
		ph.unlockPhone();
		ph.viewPictures();

	}

}
