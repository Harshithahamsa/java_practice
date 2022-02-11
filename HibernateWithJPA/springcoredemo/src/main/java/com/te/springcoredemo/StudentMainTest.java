package com.te.springcoredemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.te.springcoredemo.bean.Student;

public class StudentMainTest {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("student.xml");
		Student student = (Student) applicationContext.getBean("student");
		// Or we can write in this way without casting it.
//		Student student1 = applicationContext.getBean("student",Student.class);
		
		System.out.println(student);
		
		System.out.println(student.getCourses());
		System.out.println(student.getIds());
		System.out.println(student.getNames());
		
	}
}
