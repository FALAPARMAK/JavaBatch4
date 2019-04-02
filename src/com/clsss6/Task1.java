package com.clsss6;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		//write a program that prints out if it is good weather to go for any activity
//The weather is good if the temperature is between 40 degrees and 80 degrees & no rain  --> we will go hiking
		//otherwise --> we will not go hiking
		//tempereature between 25 and 40 inclusive & snowing __>going snowboarding
		//otherwise no snowboarding
		//if temperature is more than 80 & sunny go to beach
		//otherwise -->not go to the beach
		
		
		Scanner scan;
		boolean snow ,rain,sunny ;
		int temp;
		String activity=" " ;
		
		scan=new Scanner(System.in);
		System.out.println("Please enter a temperature");
		
		temp=scan.nextInt();
		System.out.println("Please enter a weather condition");
		
		
		if (temp>= 40 &&temp<80 ) {
			rain = scan.nextBoolean();
			if (rain) {
				activity = "Watching Tv";
			} else {
				activity = "We will go hiking";
			}
			
			
		}else if(temp>=25 && temp<=40) {
			snow=scan.nextBoolean();
			if(snow) {
				activity="We will go snowboarding";
			}else {
				activity="Doing code";
			}
			
			
		}else if(temp>80) {
			sunny=scan.nextBoolean();
			if(sunny) {
				activity="We will go to beach";
			}else {
				activity="No beach today";
			}
			
			
		}else {
			System.out.println("Please enter different temperature");
		}
		
		System.out.println("My activity for today  "+ activity);
		
		
		
		//System.out.println("No beach today");
		
		//activity="No beach today";
		
		
		
		
		
	}

}
