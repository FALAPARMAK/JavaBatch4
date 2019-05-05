package com.class32;

import java.util.ArrayList;
import java.util.Iterator;

public class TestCreditCard {

	public static void main(String[] args) {
		Visa visa= new Visa("Visa planitium");
	   MasterCard mm=new MasterCard("MC basic");
	   
		ArrayList<CreditCard>alist=new ArrayList<>();
		alist.add(visa);
		alist.add(mm);
		

		//how can I get name of each card?
		
		for(CreditCard card:alist) {
			System.out.println(card.creditCardName);
			card.annualFee();
		}
		//how can we print an interst rate of each card
		Iterator<CreditCard>myIterator=alist.iterator();
		while(myIterator.hasNext()) {
			CreditCard obj=myIterator.next();
			
		}
	}

}
