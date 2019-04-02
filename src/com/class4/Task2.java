package com.class4;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		
		int age;
		
		Scanner sc= new Scanner(System.in);
		
		
		
		System.out.println("How old are you ?");
		age= sc.nextInt();
		if(age>= 18) {
			System.out.println("You are eligibilitie  get to Drivers Licence");
		}else {
			System.out.println(" You can get a learners  permit");
		}
		

	}

}
