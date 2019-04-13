package com.class22;

public class Players {
	
	public String playername;
	public String team;
	public int age;
	
	Players(){
		
	}
	
	Players(String name, String t,int a){
		playername=name;
		team=t;
		age=a;
	}

	public void Info() {
		System.out.println(playername+" "+team+" "+ age);
	}
}
