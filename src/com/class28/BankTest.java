package com.class28;

public class BankTest {

	public static void main(String[] args) {
		Bank b =new BOA();
		b.hasChecking();
		b.hasCreditCard();
		b.hasSavings();
		
		System.out.println(Bank.hello);
		
		Bank bb =new PNC();
		bb.hasChecking();
		bb.hasCreditCard();
		bb.hasSavings();
	}
	
}
