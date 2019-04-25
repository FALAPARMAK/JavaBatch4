package Inheritance;


public class TestAnimal {

	public static void main(String[] args) {
		
		Animal aa=new Animal("bird",5,true,true);
		aa.getInfo();
		aa.canEat();
	
       aa.canMove();
       aa.canEat();
    
     
     Mammals  mm=new Mammals();
     mm.canMove();
     System.out.println(mm.canMove());
     mm.canEat();
     
		
    Animal a=new Mammals("fish",2,false,false);
    a.getInfo();
     a.canEat();//Override
    a.canMove();//Override
     System.out.println(a.canMove());
    // a.canFertile();
    
     
     
		
//     Animal anim=new Vertabres();
//     anim.canEat();
//   //  anim.canFertile();  tanimiyor  cunku override 
//     
//     Vertabres v=new Mammals();
//     System.out.println(v.canMove());
//     
//     
// constructorin icine sys yazmak mantikli degil    
     
     
     
	}

}
