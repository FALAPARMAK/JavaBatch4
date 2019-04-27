package com.class28;

public interface Bank {
	static String name="Bank";
	String hello="hi";//by default it will be public  static final
	
//by default compiler adds public & abstract  to every method
	void hasChecking();
	void hasSavings();
	void hasCreditCard();
}
class BOA implements Bank{

	@Override
	public void hasChecking() {
		System.out.println("BOA has 2 checking account");
	}

	@Override
	public void hasSavings() {
		System.out.println("BOA has 2 saving account");
	}

	@Override
	public void hasCreditCard() {
		System.out.println("BOA has 10 different cc");
	}
	
}
class PNC implements Bank{

	@Override
	public void hasChecking() {
		System.out.println("Pnc has 3 checking account");
		
	}

	@Override
	public void hasSavings() {
		System.out.println("PNC has 3 saving account");
		
	}

	@Override
	public void hasCreditCard() {
		System.out.println("PNC has 7 differnt cc");
		
	}
	
}