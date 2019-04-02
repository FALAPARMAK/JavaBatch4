package com11;

public class Task {

	public static void main(String[] args) {
		
//	Create an array on integers and calculate 
	//	the sum of all elements in an array.
		
		int total=0;
		int [] numbers={ 10,40,60,80,10};
		
		for (int i=0; i<numbers.length; i++ ){
			
		total=total+numbers[i];
			
		}
		System.out.println(total);
		
		
		
		

	//Create an array of countries. While retrieving all values from an 
	//array print capital for each country.	
		
		
		String []array= {"USA", "Russia", "Turkey", "Spain"};
		
		for(int i=0; i<array.length; i++) {
			if(array[i].equals("USA")) {
				System.out.println("Washington DC");
			}else if(array[i].equals("Russia")) {
				System.out.println("Moscov");
			}else if(array[i].equals("Turkey")) {
				System.out.println("Ankara");
			}else if(array[i].equals("Spain")) {
				System.out.println("Madrid");
			}
			
			
		}
	
		String []contries= {"USA", "Afghanistan", "Kazakhstan", "Ukraine"};
		
		
		for(String country:contries) {
			
			switch(country) {
			case "USA" :System.out.println("Washingon DC");
			  break;
			case "Afghanistan" :System.out.println("Kabil");
			  break;
			case "Kazakhstan" :System.out.println("Astana");
			  break;
			case "Ukraine" :System.out.println("Kiev");
			  break;
			}
		}
		
		
		
		
		
		
	}

}
