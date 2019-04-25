package Inheritance;

public class Animal {
	
	String  species;
	int age;
	boolean tail;
	boolean hasSketelon;
	
	 Animal(){}
	Animal(String a, int b, boolean t,boolean h){
		species=a;
		age=b;
		tail=t;
		hasSketelon=h;
		//costructor will not  be inharitance
		//constructor will not  be static
		
	}
	
	
	
	
	void canEat() {
		System.out.println("Animal can eat");
	}
	boolean canMove(){
		
		return true;
	}
	void getInfo() {
		System.out.println(species+age+tail+hasSketelon);
	}
}
	
	
	class Vertabres extends Animal{
		
		Vertabres(){}
		Vertabres(String a, int b, boolean t,boolean h){
			species=a;
			age=b;
			tail=t;
			hasSketelon=h;
		}
		int numberOfLeg;
		
		boolean hasSketelon(){
			return true;
		}
		@Override//ayni isimle cagirip degistireceksen kullan
		void canEat() {
			System.out.println("Vertabres can eat");
		}
		void canFertile() {
			System.out.println("Vertabres can  fertile");
		}
		void getInfo() {
			System.out.println(species+age+tail+hasSketelon);
		}
		
		
		
	}
	
	 class Mammals extends Vertabres{
		 Mammals(){}
		 Mammals(String a, int b, boolean t,boolean h){
			   species=a;
				age=b;
				tail=t;
				hasSketelon=h; 
		 }
		
		@Override
		boolean canMove() {
			return false;
		}@Override
		void canFertile() {
			System.out.println("Mammals can not fertile");
		}
		void getInfo() {
			System.out.println(species+age+tail+hasSketelon);
		}
		
		
	}
	
	
	
	
	
	
	


