package com.te.assignment.comparator;

public class Student  {
	
	int id;
	String name;
	double marks;

	public Student() {
		super();
		
	}
	public Student(int id, String name, double marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	
	 

}
