package com11;

public class RetrievingAllValues {

	public static void main(String[] args) {
		
		
		int [][] num= {
				{11,12,13,14},//4
				{21,22,23}, //3
				{31,32,33,34}
		}; 
		//columns always depent rows
		
		int rows= num.length;
		System.out.println(rows);
		
		int cols =num[1].length;
		System.out.println(cols);
		
	System.out.println(" ----------");	
		
		
		for(int row=0; row<num.length; row++) {
			for(int col=0; col<num[row].length; col++) {
				System.out.print(num[row][col]+" ");
			}
			System.out.println();
		}
		
		
	String [][] food = {
			{"burger", "fries", "hot dog","meatloaf"},
			{ "lo mein","fried rice"},
			{"biriyani", "korma","naan","chick peas"}	
			
			};
	
	
	for(int i=0; i<food.length; i++) {
		for(int j=0; j<food[i].length; j++) {
			System.out.print(food [i][j]+" ");
		}
		System.out.println();
	}
	
	
	
	}
		
		
		
		

	}


