package com.te.springcoredemo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.te.springcoredemo.bean.Employee;

public class EmployeeMainTest {
	public static void main(String[] args) {
//		BeanFactory beanFactory = new ClassPathXmlApplicationContext("beans.xml");
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		
		Employee employee = (Employee) applicationContext.getBean("employee");
		Employee employee2 = (Employee) applicationContext.getBean("employee2");
		System.out.println(employee);
		System.out.println(employee2);
	}
	
}
