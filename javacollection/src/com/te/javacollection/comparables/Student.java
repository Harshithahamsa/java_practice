package com.te.javacollection.comparables;

import java.util.Comparator;

public class Student implements Comparator<Student> {

	int id, roll_no;
	String name, address;
	Double salary;

	public Student(int id, int roll_no, String name, String address, double salary) {
		super();
		this.id = id;
		this.roll_no = roll_no;
		this.name = name;
		this.address = address;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Student [id = " + id + ", name = " + name + ", roll no = " + roll_no + ", address = " + address + ", salary = " + salary + "]";
	}

	@Override
	public int compare(Student o1, Student o2) {
		return 0;
		// TODO Auto-generated method stub
		
	}

}
