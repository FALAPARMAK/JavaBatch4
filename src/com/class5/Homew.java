


	
	
	

package com.class5;

import java.util.Scanner;

public class Homew {

	public static void main(String[] args) {
		
	/*	double num1,num2 ,num3;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter  3 distinct double number");
		num1=scan.nextDouble();
		num2=scan.nextDouble();
		num3=scan.nextDouble();
		
		if(num1 >num2 && num1<num3) {
			System.out.println(num1+" number1 is largest");
			
		}else if( num2>num1 && num2>num3) {
			System.out.println(num2+" number2 is largest");
			
		}else if(num3>num1 && num3>num2) {
			System.out.println( num3+" number3 is largest");
		}*/
		int num1,num2,num3,largest;
		Scanner scan;
		
		
		scan=new Scanner(System.in);
		System.out.println("Please enter  3 distinct  number");
		num1=scan.nextInt();
		num2=scan.nextInt();
		num3=scan.nextInt();
		
		
		if(num1>num2 ) {
			   if(num1>num3) {
				System.out.println( num1+" is the largest");//largest=num1;	
			   }else {
				System.out.println(num3+" is the largest");//largest=num3;
			   }
		}else {//assuming num2 num1
			   if(num2>num3) {
				System.out.println( num2+" is largest");
			   }else {
				System.out.println(num3+" is largest ");
			   }
		}
		 
		
		
		
		
	}	
		
	}	
		
		
