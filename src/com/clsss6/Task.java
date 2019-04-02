package com.clsss6;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {

		Scanner scan;
		int temp;
		String activity =" ";   // String activity=null;
		boolean snow,rain,sunny;
		
		scan=new Scanner(System.in);
		System.out.println("Enter a temperature");
		temp=scan.nextInt();
		System.out.println("Enter a weather condition");
		
		if(temp>=40 && temp<80) {
			rain=scan.nextBoolean();
			if(rain) {
				activity="No hiking";
			}else {
				activity="We will go to hiking";
			}
			
			
		}else if(temp>=25 && temp<40) {
			snow=scan.nextBoolean();
			if(snow) {
				activity="We will go to snowboard";
			}else {
				activity="No snowboard";
			}
			
			
			
		}else if(temp>=80) {
			sunny=scan.nextBoolean();
			if(sunny) {
				activity="Go to beach";	
			}else {
				activity="No beach today";
			}
		
			
			
		}else {
			System.out.println("Please enter different temperature");
		}
		
		System.out.println("My activity for today " + activity);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
