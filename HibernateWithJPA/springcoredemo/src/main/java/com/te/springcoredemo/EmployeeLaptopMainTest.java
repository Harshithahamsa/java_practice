package com.te.springcoredemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.te.springcoredemo.bean.EmployeeLaptop;

public class EmployeeLaptopMainTest {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("autowiring.xml");
		EmployeeLaptop employeeLaptop = (EmployeeLaptop) applicationContext.getBean("employee1");
		System.out.println(employeeLaptop);

		EmployeeLaptop employeeLaptop1 = (EmployeeLaptop) applicationContext.getBean("employee2");
		System.out.println(employeeLaptop1);
		
		EmployeeLaptop employeeLaptop2 = (EmployeeLaptop) applicationContext.getBean("employee");
		System.out.println(employeeLaptop2);
	}
}
