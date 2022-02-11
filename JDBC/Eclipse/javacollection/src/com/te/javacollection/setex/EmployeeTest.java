
package com.te.javacollection.setex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeTest {
	public static void main(String[] args) {
		Set<Employee> employees = new LinkedHashSet<Employee>();
		employees.add(new Employee(10, "Deepankar", 20000));
		employees.add(new Employee(30, "Anil", 15000));
		employees.add(new Employee(20, "Sankar", 25000));
		employees.add(new Employee(40, "Bhupati", 40000));
		
		System.out.println(employees);
		for (Employee employee : employees) {
			System.out.println(employee);
		}
		
		//Sorting A HASHSET by converting into list
		System.out.println("After sorting");
		ArrayList<Employee> employees2 = new ArrayList<Employee>(employees);
		Collections.sort(employees2);
		for (Employee employee : employees2) {
			System.out.println(employee);
		}
		
		System.out.println("Sorting By TreeSet");
		//Sorting a hashset by it into treeset 
		Set<Employee> employees3 = new TreeSet<Employee>(employees);
		for (Employee employee : employees3) {
			System.out.println(employee);
		}
	}
}
