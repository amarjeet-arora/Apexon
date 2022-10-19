package com.app;

public class EmployeeMain{

	public static void main(String[] args) {
		 // object is created
		Employee emp = new Employee();
		
		emp.setEmpId(101);
		emp.setEmpName("John");
		emp.setCity("London");
		
		System.out.println("Employee Data " +emp.getCity() + " " + emp.getEmpName());
		System.out.println(emp.hashCode());
		
		
		//------
		System.out.println("Using constructor");
		
		Employee empCons= new Employee(101, "Sam", "Mumbai");
		
		System.out.println(empCons);
		System.out.println(empCons.hashCode());
		

	}

}
