package com.class22;

public class TestPlayers {

	public static void main(String[] args) {
		
		Players player1=new Players();
		player1.team="Turkey";
		player1.age=25;
		
		
		Players player2=new Players("Ali", "Turkey", 30);
		player1.playername="Ahmet";
		
		
		player1.Info();
		player2.Info();
	}

}
