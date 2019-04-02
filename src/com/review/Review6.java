package com.review;

import java.util.Scanner;

public class Review6 {

	public static void main(String[] args) {
		
/*	Scanner scan;
	int age;
	String output="";
	
	scan=new Scanner(System.in);
	System.out.println(" Please enter a number");	
    age=scan.nextInt();  
		
	if	(!(age>18)) {
		output="Too Young";
	}else if(age>=18 && age<35) {
		output="Young Person";
		}else if(age==36 || age<=99 ) {
			output="You are Middle age person";	
	}else if(age>100) {
		output="You are too old";
	}
		
		System.out.println(output);
		
		*/
		
		
	/*	Scanner scan;
		String day;
		int num;
		scan=new Scanner(System.in);
		System.out.println("Enter a number");
		num=scan.nextInt();
		
		
		switch(num) {
		
		case 1:
			day="Monday";
			break;
		case 2:
			day="Tuesday";
			break;
		case 3:
			day="Wednesday";
			break;
		case 4:
			day="Thuersday";
			break;
		case 5:
			day="Friday";
			break;
		case 6:
			day="Saturday";
			break;
		case 7:
			day="Sunday";
			break;
			default :
			day="invalid";
				
		
		
		}System.out.println(day);
		
	*/
	 
		
	 Scanner scan;
	String	levelString;
	int level = 0;
	
	scan=new Scanner(System.in);
	System.out.println(" What is the level name?");
	levelString=scan.nextLine()	;
	
	switch(levelString){
	
	case "Beginner":
		level= 1;
		break;
	case"Intermediate":
		level=2;
		break;
	case "Expert":
		level=3;
		break;
		
	
	
	
	
	
	}System.out.println(level);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
