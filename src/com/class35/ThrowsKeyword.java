package com.class35;

public class ThrowsKeyword {
public static String name;
	public static void main(String[] args)   {
		
		
		sleepMode();// try catch yapilmazsa kim cagirirsa hata alacak	
                    // best option always try catch
	}
	
	public static void studentSleeping() throws InterruptedException {
		System.out.println("Student "+ name+" is sleeping");
		Thread.sleep(5000);
		System.out.println("Give some coffeee..");
	}
	public static void allStudentsSleeping() throws InterruptedException {
		studentSleeping();//diger methodu cagiriyor//I dont want handled (throws)
	}
	public static void sleepMode() {
		try {
			allStudentsSleeping();
		} catch (InterruptedException e) {
 			
			e.printStackTrace();
		}
	}

}
