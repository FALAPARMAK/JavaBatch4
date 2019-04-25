package com.class26;

public class UserClass {
	public String name;
	public long mobileNo;
	
	public	UserClass(){
		
	}

	
	
public	UserClass(String name,long mobileNo){
		this.name=name;
		this.mobileNo=mobileNo;
	}

}
class UserInfo extends UserClass{
	public String adress;
	
	public UserInfo(String name,long mobileNo,String adress){
		super(name,mobileNo);
		this.adress=adress;
	}
	public void userDetails() {
		System.out.println("User name is "+name+" and mobile number + "+mobileNo
				+" and adress is "+ adress);
	}
}