package com.class2;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		
		String animal,eat;
		
		
		
	
		Scanner scan=new Scanner(System.in);
		System.out.println("What does your animal eat");
		animal=scan.nextLine();
		
		switch(animal) {
		
		case "dog":
			eat="meat";
			break;
		case "cat":
			eat="milk"; 
			break;
		case "bird":
			eat="worm";
		    break;
			
		case "panter":
			eat="meat";
		    break;
		case "giraffe":
			eat="leave";
			break;
		case "fish":
			eat="ant";
			break;
		case "monkey":
			eat="banana";
			break;
		case"zebra":
			eat="grass";
			break;
		case"ant":
			eat="seed";
			break;
			
			default:
				eat="unknown";
			
		
		
		
		
		
		}System.out.println("Your animal eats " + eat);
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
