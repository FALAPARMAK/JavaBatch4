package com.class12;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		/*Accept username, password and confirm password and check
		 *  following requirements:

         Username and Password cannot be  empty, if so→ message=”Username and Password cannot be empty”.
         Password should be minimum 8 characters, if less → message=”Password is too short”.
         Password cannot contain username if so, → message=”Password cannot contain username”.
         Password should match confirmed password,if not  → message “Passwords do not match”.
         Only after all requirements met → message“Your username and password has been created
		 * 
		 */
	
	
	String userName, password,confirmedPassword;
	
	Scanner scan=new Scanner(System.in)	;
	System.out.println("please enter your username ");
	 userName=scan.nextLine();
	
	System.out.println("please enter your password ");
	 password=scan.nextLine();
	
	System.out.println("please confirm your username ");
	confirmedPassword=scan.nextLine();
	
	
	
	if(!(userName.isEmpty() && password.isEmpty())) {
		if(password.length()>8) {
			if(password.contains(userName)) {
				if(password.equals(confirmedPassword)) {
					System.out.println("Password and username created");
				}else {
					System.out.println("Password do not match");
				}
				
			}else {
				System.out.println("Can not be contain username");
			}
			
		}else {
			System.out.println("Too short");
		}
		
	}else {
		System.out.println("Can not be empty");
	}
	
	
	
	
	
		
		
		
		
		
		
		
		
		
		
		
	}

}
