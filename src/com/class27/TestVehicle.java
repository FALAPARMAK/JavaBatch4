package com.class27;

public class TestVehicle {

	public static void main(String[] args) {
		Vehicle v=new Car();
		v.breaks(false);
		v.changeGear(1);
		v.speed(1);
		
		Vehicle vv=new Car();
		vv.breaks(false);
		vv.changeGear(0);
		vv.speed(0);
		//vv.IsAuto();  no
	
		
		Auto a= new Car();
		a.IsAuto();
		
       Car cc=new  Car();
       cc.changeGear(2);
       cc.speed(0);
       cc.breaks(false);
       cc.IsAuto();
	}

}
