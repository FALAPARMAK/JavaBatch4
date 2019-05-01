package com.class29;

public class TestShape {

	public static void main(String[] args) {
	Circle cc=new Circle();//Shape is interface.We cannot object.
	cc.calculateArea(20);
	cc.calculatePerimiter(30);
	cc.whoAmI();
	
	Shape obj=new Square();
	obj.calculateArea(10);
     obj.calculatePerimiter(20);
    // obj.WhoAmI(); not available
	}

}
