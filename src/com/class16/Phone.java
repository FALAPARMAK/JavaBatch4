package com.class16;

public class Phone {
	/*Create a Class “Phone”. Create 3 Objects of it:
	 *  iPhone, Android, Nokia with specific  attributes and behaviours.
	 */

	/*Create a Dog Class and create 3 different objects of it:
	 * Husky, Bulldog, Labrador  with specific  attributes and behaviours.
	 */
		
		
	String model;
	boolean camera ,calling;
	int memory;
	
	public static void main(String[] args) {
		
		Phone phone1=new Phone();
		 phone1.calling=true;
		 phone1.camera=true;
		 phone1.calling=true;
		 phone1.model="IPhone";
		 phone1.memory=128;
		 
		 
		 phone1.takePhoto();
		 phone1.watchMovie();
		 phone1.textMessage();
		

			Phone phone2=new Phone();
			 phone2.calling=true;
			 phone2.camera=true;
			 phone2.calling=true;
			 phone2.model="Nokia";
			 phone2.memory=64;
			 
			 
			 phone2.takePhoto();
			 phone2.watchMovie();
			 phone2.textMessage();
			 
			 

				Phone phone3=new Phone();
				 phone3.calling=true;
				 phone3.camera=false;
				 phone3.calling=true;
				 phone3.model="Android";
				 phone3.memory=32;
				 
				 
				 phone3.takePhoto();
				 phone3.watchMovie();
				 phone3.textMessage();
				
			 
			
		
	}

	 void takePhoto() {
		System.out.println("We can take a photo "+model);
		
	}void watchMovie(){
		System.out.println("We can watch movie "+model);
	}void textMessage(){
		System.out.println("We can sent a text message "+model);
	}

}
