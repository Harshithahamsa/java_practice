package com.te.javacollection.comparables;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

//import com.sun.java.swing.plaf.windows.WindowsTreeUI.CollapsedIcon;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee employee = new Employee(14, "Deepankar", 20000.35);
		Employee employee1 = new Employee(124, "Sankar", 22000.55);
		Employee employee2 = new Employee(98, "Bhupati", 20400.09);
		Employee employee3 = new Employee(34, "Gopinath", 11000.31);
		Employee employee4 = new Employee(54, "Anil", 30000.35);
		Employee employee5 = new Employee(18, "Akhsaya", 25000.78);
		
		ArrayList<Employee> arrayList = new ArrayList<Employee>();
		arrayList.add(employee);
		arrayList.add(employee1);
		arrayList.add(employee2);
		arrayList.add(employee3);
		arrayList.add(employee4);
		arrayList.add(employee5);
		
		System.out.println(arrayList);
		
		System.out.println("====Before Sorting=========");
		
		for (Employee employee6 : arrayList) {
			System.out.println(employee6);
		}
		
		System.out.println("==============================");
		
		Iterator<Employee> iterator = arrayList.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}
		
		System.out.println("======After Sorting==============");
		Collections.sort(arrayList);
		for (Employee employee6 : arrayList) {
			System.out.println(employee6);
		}
		
		
	}
}
