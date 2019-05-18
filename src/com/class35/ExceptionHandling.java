package com.class35;

public class ExceptionHandling {

	public static void main(String[] args) {
		System.out.println("Beginning ");
		
		try {
			Thread.sleep(2000);//object of an exc might be thrown(new InterruptedException)
		}catch(InterruptedException e) {
			System.out.println("I am a catch block code");
			e.getMessage();
		}
		System.out.println("The end of the program");
        // ArithmeticException e=new InterruptedException();
		//Exception e=new InterruptedException();
		
		
	}

}
