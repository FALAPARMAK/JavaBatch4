package com.class29;

public class Registration {

	/*
	 * //. Create Registration Class in which you would have variables //as email,
	 * userName and password that have an access scope only within its own class.
	 * //After creating an object of the class user should be able to call methods
	 * and in //each method separately pass values to set users email, username and
	 * password.Requirements: //Valid email consider to be only gmailValid userName
	 * and password cannot be empty and should be of length larger than 6
	 * characters. //Also valid password cannot contain userName.
	 */

	private String  email;
	private String username;
	private String password;
	
	
	public  String getEmail() {
		return email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		if(!username.isEmpty()){
			this.username = username;	
		}else {
			System.out.println("User name can not be empty");
		}
		
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		if(!password.isEmpty()) {
			this.password = password;
		}else {
			System.out.println("Password can not be empty");
		}
			
		}
		
	public void setEmail(String email) {
		if(!(username.isEmpty() && email.length()>6)){
			if(!password.contains(username)) {
				this.email = email;	
			}
			
		}
		
	}
	
	
}
