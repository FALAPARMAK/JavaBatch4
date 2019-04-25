package com.class25;

public class SyntaxStudents extends Student {

	 public void study() {
		System.out.println("Students must study HARD");
	}
	protected void doHoHomeworh() {
		System.out.println("Students must do REPL");
	}
	void attendClass(String str) {
		System.out.println("Students must attend ALL classes");
	}
	//creating child specific private method doResearch
	private void doResearch() {
		System.out.println("Student must research IN GOOGLE");
		
	}
}
