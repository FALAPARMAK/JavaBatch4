package com.class25;

public class TestPayment {

	public static void main(String[] args) {
		Payment parent=new Payment();
		parent.makePayment();
		
		MasterCard m=new MasterCard();
		m.makePayment();
		
		
		Visa visa= new Visa();
		visa.makePayment();
		visa.annualFee();
		//achieving run time polymorphism
		//pay- reference variable payment type
		//new MasterCARD() creating an object
		
		Payment pay=new MasterCard();
		//ant method that exist in parent and common in child
		pay.closePayment();
		pay.makePayment();
		
		
		Payment pay1=new Visa() ;
		pay1.closePayment();
		pay1.makePayment();	
		
		
		
		
		
		
		
		

	}

}
