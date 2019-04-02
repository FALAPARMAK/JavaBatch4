package com.class12;

public class ForEachIn2D {

	public static void main(String[] args) {
	/* Create a grocery list : fruits{}
	 *                        :veggies{}
	 * 	                       : dairy {}
	 *Retrive all values using 2 different loops 
	 */
		
		String [][] gro= {
				{"banana ", "apple ", "kiwi"},
				{"onion ", "tomatoes ", "cucumber ","patetoes"},
				{"milk", " cheese"}
		};
		
	for(int i=0; i<gro.length;  i++) {
		for(int j=0; j<gro[i].length;  j++) {
			System.out.print(gro[i][j]+ " ");
		}
		System.out.println();
	}
		
		System.out.println("-----For each loop----");
		
		
		
		
		for(String [] SingleArray:gro ) {
			for(String item:SingleArray) {
				System.out.print(item+ " ");
			}
			System.out.println();
		}
		

	}

}
