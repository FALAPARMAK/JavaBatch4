package com.class24;

public class Bank {
	
	public int chargeInterest() {//Overriden 
		return 0;
	}
}


       //1.child 
	    class BOA extends Bank{ 
		   @Override    //annotation
		   public int chargeInterest() {
			return 2;
		
	    }
	    }  
		
		// 2.child class
		class PNC extends Bank {
			
			   public int chargeInterest() {
				return 3;
			}
		}
	
