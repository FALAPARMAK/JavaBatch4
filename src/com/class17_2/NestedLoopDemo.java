package com.class17_2;

public class NestedLoopDemo {

	public static void main(String[] args) {
		
		NestedLoopDemo demo=new NestedLoopDemo();
		demo.printNumber ();
		
		

	}
	void printNumber() {
		for(int i=1;i<=3; i++) {
			for(int y=1; y<=3;y++) {
				System.out.println(i+" "+y);//11 12 13 21 22 23 31 32 33
			}
		}
		
		
		
	}

}
