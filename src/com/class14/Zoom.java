package com.class14;

public class Zoom {

	public static void main(String[] args) {
		
				String text1="This is our 1. code meeting 234 ";
				        
				        
				        char[] array= text1.toCharArray();
				        for (int i=0;i<array.length;i++) {
				            if(array[i]=='1') {
				                array[i]='3';
				            }else if(array[i]=='3') {
				                array[i]='1';
				            }
				            System.out.print(array[i]);
			
				        }

	}

}
