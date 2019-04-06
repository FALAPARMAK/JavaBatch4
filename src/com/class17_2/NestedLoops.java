package com.class17_2;

public class NestedLoops {

	public static void main(String[] args) {
	//  I wanna 12345 4 rows and 5 columns
	//	        12345
	//	        12345
	//          12345	
		
		
		 NestedLoops obj= new  NestedLoops();
		 obj. PrintNestedLoops();
		 obj.Numbers();
		 obj.Pattern();
		 obj.PrintNumbers();
		
		
		

	}
	void PrintNestedLoops() {

		for(int i=0; i<=5; i++) {
			System.out.print(i);
			
		}for(int i=0; i<=5; i++) {
			System.out.print(i);
			
		}for(int i=0; i<=5; i++) {
			System.out.println(i);
		}
	}
	
	void Numbers () {
		for(int i=1; i<=7; i++) {
			for(int y=1; y<=7; y++) {
				System.out.print(i);//1111111 2222222 3333333
			}
			System.out.println();
		}
	}
	void Pattern() {
		for(int a=0; a<4; a++) {
			for(int b=0; b<5; b++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
    void PrintNumbers() {
    	for(int i=1; i<5; i++) {
			for(int y=1; y<=9; y++){
			
				System.out.print(y);//12345
				
			}
			System.out.println("");
		}
    }
}
