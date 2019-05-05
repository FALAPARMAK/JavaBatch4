package com.class32;

public abstract class CreditCard {
	public String creditCardName;

	public CreditCard(String creditCardName) {
		super();
		this.creditCardName = creditCardName;
	}

	public void openAccount() {
System.out.println("Open "+creditCardName+"credit card");
	}
	
	public abstract void interestRate();
	public abstract void annualFee();

}
class Visa extends CreditCard{

	public Visa(String creditCardName) {
		super(creditCardName);
		
		
	}

	@Override
	public void interestRate() {
		System.out.println(creditCardName+"card has interest rate of 22%");
		
	}

	@Override
	public void annualFee() {
		System.out.println("card has annual fee $200");
		
	}
	
}class MasterCard extends  CreditCard{

	public MasterCard(String creditCardName) {
		super(creditCardName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void interestRate() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void annualFee() {
		// TODO Auto-generated method stub
		
	}
	
}
