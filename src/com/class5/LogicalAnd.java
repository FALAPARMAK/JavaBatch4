package com.class5;

import java.util.Scanner;

public class LogicalAnd {

	public static void main(String[] args) {
		/*ask user to enter age and based on the age we will print 
		 * if age is older than1 but less than 3  babby
		 *                     3 but          5    toddler
		 *                     5              13   kid
		 *                      13             20  teenager
		 *                      20             64    adult
		 *                                             senior
		 */ 
		
		Scanner myScanner;
		int age;
		 myScanner= new Scanner(System.in);
		 System.out.println(" please enter your age");
		 age=myScanner.nextInt();
		 
		 if(age>=1 && age<3) {
			 System.out.println(" baby"); 
		 }else if (age>=3 && age <5){
			 System.out.println(" toddler");
		 }else if (age >=5 && age <13) {
			 System.out.println(" kid");
		 }else if (age>=13 && age <20) {
			 System.out.println(" teenager");
		 }else if(age>=20 && age< 64) {
			 System.out.println(" adult");
		 }
		 else {
			 System.out.println(" senior");
		 }
		 
		
		

	}

}
