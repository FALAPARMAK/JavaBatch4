package com.class24;

public class TestEmployees {

	public static void main(String[] args) {
		
		Employee emp =new Employee();
		FullTimeEmployee ft=new FullTimeEmployee();
		Contractor contractor=new Contractor();
		
		emp.getpaid();
		ft.getPaid();
		contractor.getpaid();
	}

}