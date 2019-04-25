package com.class26;

public class TestPhone {

	public static void main(String[] args) {
		Phone p=new Phone();
		p.makeCall();
		p.hasCamera();
		
		iPhone ip=new iPhone();
        ip.hasCamera();
        ip.makeCall();
        
        Samsung sam=new Samsung();
        sam.hasCamera();
        sam.makeCall();
        
        Nokia n=new Nokia();
        n.makeCall();
        n.hasCamera();
        
        System.out.println("---object of iphone class referring to the Parent-----");
        Phone phon=new iPhone();//polimorfphism
        phon.makeCall();
        phon.hasCamera();
        
        Phone p1=new Nokia();
        p1.hasCamera();
        p1.makeCall();
       // p1.cannotBreak(); c error.method is undefined
        
        //creating a variable of a parent type
        Phone parentPhone;
        //assigning iphone object
        parentPhone=new iPhone();
        parentPhone.makeCall();
        parentPhone.hasCamera();
        //assigning samsung object
        parentPhone=new Samsung();
        parentPhone.makeCall();
        parentPhone.hasCamera();
        //assigning Nokia object
        parentPhone=new Nokia();
        parentPhone.hasCamera();
        parentPhone.makeCall();
        
	}

}
