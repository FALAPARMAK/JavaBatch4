package com.class36;

public class Task {

	public static void main(String[] args) {
	//create an exception :when user it trying to 
	//	withdraw larger than amount that  ebalnce throw an exception saying 
	//	"you dont have enough money"
		withdraw(600.00,1000.00);
		
	}
	public static void withdraw(double money, double balance) {
		if(money<balance) {
			System.out.println("Here is your money");
		}else {
			throw new ArithmeticException("you dont have enough money");
		}
	}
	
	

}
