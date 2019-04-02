package com.review;

public class ArrayTask2 {

	public static void main(String[] args) {
		
		int [][] ar = {{1,2,3},{4,5,6,9},{7,8,9}};
		for(int i=0; i<ar.length; i++) {
			for(int y=0; y<ar[i].length ; y++) {
				System.out.print(ar[i][y]+" ");
			}
		}System.out.println();
		
		System.out.println(" Second way  ");
		
		for(int []inn:ar) {
			for(int elements:inn) {
				System.out.print(elements+" ");
			}
		}
		
		System.out.println();
		
//              Write a program to find the average of row 2.
//             2 6 9 3 7
//             1 7 9 4 8
//             0 4 6 2 5
//             0 1 2 3
 int[][] rating = { { 2, 6, 9, 3, 7 }, 
		            { 2, 7, 9, 4, 8 },
		            { 0, 4, 9, 2, 5 }, 
		            { 0, 1, 9, 3 } };
		int sum1=0;

 
 for(int a=0; a<rating.length; a++) {
	 for(int b=0; b<rating[a].length; b++) {
		 sum1+=rating[1][b];
		 
	 }
 }
 System.out.println("The avarage is :"+sum1/rating.length );
 
 
 
 
 
 
 
 
 
 
     int sum=0;
 
		for(int i=0; i<rating[1].length; i++) {
			
				sum+=rating[2][i] ;	
			
			
			
		}
		System.out.println("The avarage is "+sum/(rating[1].length) );
		
		
		
		for(int i=0; i<rating.length; i++) {
			for(int y=0; y<rating[i].length; y++) {
				
				if(rating[i][y]>7) {
					System.out.println(rating[i][y]);
				}
				
				
		System.out.println();		
				
				
				
	int count=0;
	
	for(int []inner: rating) 
	
	{
		for(int data:inner) {
			if(data>7) {
				count++;
				System.out.print(data);
			}
			
		}
		
	}
	
	}
		
	
	
	
		
	
	
	
	
				
				
				
				
				
				
			}
		
		
		
		
		
		
		
		
		
		
	
		
	}

}
