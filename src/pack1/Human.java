package pack1;

public class Human {
	
	static String eyeColour="Brown";
	
	int height=6;
	int weight=180;
	String gender="F";
	
	
	String programmingLanguage="java";
	
	void speak() {
		String language="English";
		System.out.println("Humans can speak "+language);
	}
	
   void coding() {
	   System.out.println("Syntax students can code");
   }
   
   void print() {
	  System.out.println(eyeColour); 
   }
   
   public static void main(String[] args) {
	   Human person=new Human();
		System.out.println(person.eyeColour);
		System.out.println(person.height);
		System.out.println(person.weight);
		System.out.println(person.gender);
		
}
}
