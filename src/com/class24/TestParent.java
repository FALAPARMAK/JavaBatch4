package com.class24;

public class TestParent {

	public static void main(String[] args) {
		
		String a;
		a="10";
		
		Parent parent=new Parent();
		parent.love();
		parent.work();
		
		
		Child child=new Child();
		child.cry();
		child.love();
		child.work();
		//type casting
		Parent obj=new Child();
		//Child obj1=new Parent();//not possible
		
        obj.work();//parent work
        obj.love();//child love
        //obj.cry();//not accessible
	}

}
