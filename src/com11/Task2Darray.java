package com11;

public class Task2Darray {

	public static void main(String[] args) {
	//	Create a 2D array where you will store the following values: Mr, Mrs, Ms, Miss 
		//and  Smith, Jordan, Jackson, Obama.
	//	After storing values print the following:
	//	Mrs Smith, Mr Obama, Ms Jackson.
		
		
		
		
		
		String[][] name= {{"Mr", "Mrs", "Ms", "Miss"},
				
				          {"Smith", "Jordan", "Jackson","Obama"}
				          
		};
		System.out.println(name[0][0]+ " "+name[1][0]+" ,"+name[0][0]+name[1][3]+","+name[0][2]+" "+name[1][2]); 
				
				
				
	/*Create a 2D array that first row will contain 4 names and second row will contain grades.
	 *  Then you program should print name of the students that has as an A and B grade
	 * 	
	 */
		
		
		String [][]student= {{"Bob", "Anna", "Sara","Tom"},
				             {"A", "B"}
		};
		
		
		System.out.println(student [0][3]+"s grade is " +student [1][0]);
		
		System.out.println(student [0][1]+"s grade is " +student [1][1]);
		
		
		
		

	}

}
