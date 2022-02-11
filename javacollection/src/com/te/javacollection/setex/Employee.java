package com.te.javacollection.setex;

public class Employee implements Comparable<Employee> {
	int id;
	String name;
	double salary;

	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id = " + id + ", Name = " + name + ", Salary = " + salary + "]";
	}

	@Override
	public int compareTo(Employee o) {
//		return this.id -o.id;
		return this.name.compareTo(o.name);
	}

}
