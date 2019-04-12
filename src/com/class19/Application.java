package com.class19;

public class Application {

	public static void main(String[] args) {
		
	Animal anim=new Animal();
	
	System.out.println("This is  anim");
	
	System.out.println(anim.age);
	System.out.println(anim.weight);
	System.out.println(anim.breed);
	System.out.println(anim.name);
	
	anim.name="Joe";
	anim.age=40;
	System.out.println(anim.age);
	
	Animal anim2=new Animal();
	
	System.out.println("This is anim2");
	
	System.out.println(anim2.age);
	System.out.println(anim2.weight);
	System.out.println(anim2.breed);
	System.out.println(anim2.name);
	
	
	Animal anim3=new Animal();
	
	System.out.println("This is anim3 ");
	System.out.println(anim3.age);
	System.out.println(anim3.weight);
	System.out.println(anim3.breed);
	System.out.println(anim3.name);
	
	
	int arr[] = { 34, 3, 4, 5, 6, 7, 8, 99, 10 };
	int array[]= {2,33,44,1,232,1000,134};
	System.out.println("Printing the minumum value");
	
	System.out.println(Minumum.minOfValues(arr));
	System.out.println(Minumum.minOfValues(array));
	
	
	
	
	
	}

}
