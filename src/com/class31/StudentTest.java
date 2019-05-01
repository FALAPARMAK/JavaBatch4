package com.class31;

import java.util.ArrayList;
import java.util.Iterator;

public class StudentTest {

	public static void main(String[] args) {
	Student st1=new Student("Ali",(101));
	Student st2=new Student("Veli",(161));
	Student st3=new Student("AHmet",(201));
	Student st4=new Student("Ayse",(401)); 

	
	ArrayList<Student> alist=new ArrayList<>();
	alist.add(st1);
	alist.add(st2);
	alist.add(st3);
	
	for(Student student:alist) {
		student.Print();
		System.out.println(student.name);
	}
	
	Iterator<Student>it=alist.iterator();
	
	while(it.hasNext()) {
		Student obj=it.next();
		obj.Print();
	}
	
	
	}

}
