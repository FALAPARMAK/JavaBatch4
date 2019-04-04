package com.review;

import java.util.Scanner;

public class ReviewWegasDay {

	String eyes;//outside the method but in class
	String hair;
	String nose;
	String shirt;
	
	public static void main(String[] args) {
		
		ReviewWegasDay wegas=new ReviewWegasDay();
		//wegas.eyes="blue";
		//we//gas.hair="blue";
		//wegas.nose="brown";
		//wegas.shirt="gray";
		//wegas.eyes="green";
		
		
	//	ReviewWegasDay wegas1=new ReviewWegasDay();
	//	wegas1.eyes="green";
		
	//	System.out.println(wegas.eyes);
		
		//wegas.scannerFirstName();
		wegas.noReturn();
		//wegas.scannerInt();
		wegas.ReverseString();
		wegas.vowelCountWithLoop();
		wegas.vowelCountWithReplaceAll();
	}
	
	void humanEyes() {
		ReviewWegasDay wegas=new ReviewWegasDay();
		wegas.eyes="blue";
	}
	
	void noReturn(){
		System.out.println("I dont have return type");
	}
	
	/*void scannerFirstName() {
		Scanner scan=new Scanner(System.in);
		scan.nextLine();
	}
	
	void scannerInt() {
		Scanner scan=new Scanner(System.in);
		scan.nextInt();
	}*/
	
	
	
	void ReverseString() {
	
		String str="Syntax Technologies";
		String reverse="";
		for(int i=str.length()-1; i>=0; i--) {
			reverse+=str.charAt(i);
			
		}
		System.out.println(reverse);
		
		
	}
	
	
	void vowelCountWithLoop() {
		String wegas="hello world my name is wegas";
		char[]w=wegas.toCharArray();
		char empty;
		for(int i=0;  i<w.length-1; i++) {
			if(w[i]=='a' || w[i]=='A' || w[i]=='e' ||w[i]=='E'||w[i]=='i'||w[i]=='I'||w[i]=='o'||w[i]=='O' ) {
				empty=w[i];
				System.out.print(empty+" ");
			}
		}
	}
	
	
	  void vowelCountWithReplaceAll() {
	        String weqas="hello world my name Is wEqas";
	        String replace =weqas.replaceAll("[^aA,eE,iI,oO,uU]", "");
	        //String replace =string.replaceAll("[^aA,eE,iI,oO,uU]", "");

	        System.out.println(replace);
	    }
	
	
	
	
	
	
	
	
	
	
	
	
}
