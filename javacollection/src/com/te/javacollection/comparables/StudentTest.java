package com.te.javacollection.comparables;

import java.util.ArrayList;

public class StudentTest {
	public static void main(String[] args) {
		ArrayList<Student> arrayList= new ArrayList<Student>();
		arrayList.add(new Student(20, 6, "Deepankr", "India", 40900));
		arrayList.add(new Student(10, 5, "Bhupati", "Dubai", 10000));
		arrayList.add(new Student(30, 7, "Sankar", "NewYork", 600000));
		
		System.out.println(arrayList);
		
		for (Student student : arrayList) {
			System.out.println(student);
		}
	}
}
