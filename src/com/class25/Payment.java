package com.class25;

public class Payment {

	
	
	public void makePayment() {//overridden method
		System.out.println("Payment with no fee");
	}
	public void closePayment() {
		System.out.println("All payment closed");
	}
	
	
}

class MasterCard extends Payment{

	public void makePayment() {//overriding method
		System.out.println("Payment with MC and 2%fee");
	}
	
}
class Visa extends Payment{
	public void makePayment() {
		System.out.println("payment with Visa and 1.5% fee");
	}
	
	public void annualFee() {
		System.out.println("Visa card has annual fee");
	}
}