package com.class32;

public class ArrayTest {

	public static void main(String[] args) {
		
		String a="A";
		String b=new String("B");
		
		int [] intArray={10,21,34};
		
		String [] stringArray= {"hello","bye"};
		
		//Can we place Object into Array?
		
		Visa v=new Visa("Visa Platinium");
		Visa v1=new Visa("Visa Platinium");
		Visa v2=new Visa("Visa Platinium");
		
		MasterCard m=new MasterCard ("Master");
		MasterCard m1=new MasterCard ("Master");
		MasterCard m2=new MasterCard ("Master");
		
	
CreditCard [] visaArray= {v,v1,v2,m,m1,};
Object [] objectArray= {v,v1,v2,m,m1,true,"Jonn"};	//
		
}
}