package com.clsss6;

import java.util.Scanner;

public class CountryAndCapture {

	public static void main(String[] args) {
		  
		String country, language;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter  your country");
        country=scan.nextLine();
       
        
        switch(country) {
        
        case "USA":
        	language="English";
        	break;
        case "Russia":
        	language="Russian";
        	break;
        case"Turkey":
        	language="Turkish";
        	break;
        case"Germany":
        	language="German";
            break;
        case"China":
        	language="Chinese";
        	break;
        default:
        	language="Unknown";
        } 
        	
        System.out.println("Your language is "+language );
        
	}

}
