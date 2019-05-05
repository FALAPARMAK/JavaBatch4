package com.class32;

import java.util.ArrayList;
import java.util.Iterator;

public class TestInsurance {

	public static void main(String[] args) {
		Car c=new Car("Geico");
		Pet p=new Pet("Pet plan");
		Health h=new Health("First Care");
		
		ArrayList<Insurance>alist=new ArrayList<>();
		alist.add(c);
		alist.add(p);
		alist.add(h);
		
		for(Insurance ins :alist) {
			System.out.println(ins.insuranceName);
			ins.cancelInsurance();
		}
		 Iterator<Insurance>it=alist.iterator();
         while(it.hasNext()) {
             Insurance obj=it.next();
             System.out.println(obj.insuranceName);
         }
     
         for(int i=0;i<alist.size();i++) {
             Insurance obj1=alist.get(i);
         obj1.getQuote();
         

	}

}}
