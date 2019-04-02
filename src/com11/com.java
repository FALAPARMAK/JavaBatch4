package com11;

public class com {

	public static void main(String[] args) {
		
		String [] names = new String [6];
		
		names [0]= "Asel";
		names [1]= "Awet";
	    names [2]= "Arif";
	    names [3]= "Wegas";
	    names [4]= "Dzmitri";
	    names [5]= "Shiva";
		
	   for (int i=0; i<names.length; i++) {
		   System.out.println(names [i]);
	   }
	    ////create an array using array literal
	   
	   
	   String []studentsNames= { "Shaban", "Bilal","Mehmet","Zaki","Samir","Frank"};
	    
	   System.out.println("----------for loop --------------");
	   
	   for(int i=0; i<=studentsNames.length-1; i++) {
		   System.out.println(studentsNames[i]);
	   }
	   
	   System.out.println("----------advanced for loop --------------");
		////retrieve values using : advanced for loop , for each loop, enhaced for loop

	   for(String student:studentsNames)
	   System.out.println(student);
	   
	   
	   
	}

}
