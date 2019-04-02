package com.class8;

public class BreakContinue {

	public static void main(String[] args) {
		
		for(int i = 1; i<=10; i++) {
			
			if(i==5) {
				break;
			}
			System.out.println(i);
			
		}
		
		for(int g=0; g<=4; g++) {//if there is no condition ,only one time
			System.out.println("Hello");
			break;
		}
		
		

	}

}
