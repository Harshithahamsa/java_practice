package com.te.annotationjava.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.te.annotationjava.bean.Employee;
import com.te.annotationjava.config.AnnotationConfig;

public class EmployeeMain {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AnnotationConfig.class);
		Employee employee = (Employee) applicationContext.getBean("employeeNew");
		System.out.println(employee);
		System.out.println(employee.getLaptop().getLaptopName());

	}
}
