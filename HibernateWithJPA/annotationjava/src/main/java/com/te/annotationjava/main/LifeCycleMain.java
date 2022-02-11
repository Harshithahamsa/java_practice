package com.te.annotationjava.main;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.te.annotationjava.lifecycle.LifeCycleMethods;

public class LifeCycleMain {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("lifecycle.xml");
		context.registerShutdownHook();
//		context.close();
		LifeCycleMethods cycleMethods = (LifeCycleMethods) context.getBean("lifecycle");
		System.out.println(cycleMethods);
		context.close();
		
	}
}
