package com.class21;

public class Employee {

	int eID;
	int salary;
	public static String CEO = "Sumair";

	public static void main(String[] args) {
		// Create a Class called Employee:
		// Create three variables eID , salary and set the CEO to “Sumair”
		// Create two objects of the class Employee
		// Set the value of eID, salary for each of the objects
		// Print out the eID , salary and CEO for each of the objects

		Employee employee1 = new Employee();
		Employee employee2 = new Employee();

		employee1.eID = 12786;
		employee2.eID = 38689;

		employee1.salary = 90000;
		employee2.salary = 80000;

		employee1.InfoOfEmployees();
		employee2.InfoOfEmployees();
	}

	void InfoOfEmployees() {
		System.out.println("Employe id " + eID + "salary is " + salary + "and Ceo is " + CEO);
	}

}
