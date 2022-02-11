package com.te.javacollection.setex;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<EmployeeComparator>{

	int id;
	String name;
	double salary;
	
	
	
	public EmployeeComparator() {
		super();
	}


	public EmployeeComparator(int id, String name, double salary) {
		
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	
	@Override
	public String toString() {
		return "Employee [id = " + id + ", Name = " + name + ", Salary = " + salary + "]";
	}


	@Override
	public int compare(EmployeeComparator o1, EmployeeComparator o2) {
		return o1.id - o2.id;
	}
	
}
