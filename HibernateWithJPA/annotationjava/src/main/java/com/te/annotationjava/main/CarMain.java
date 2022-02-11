package com.te.annotationjava.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.te.annotationjava.bean.Car;
import com.te.annotationjava.config.CarConfig;

public class CarMain {
public static void main(String[] args) {
	ApplicationContext applicationContext = new AnnotationConfigApplicationContext(CarConfig.class);
	Car car = applicationContext.getBean("getCar",Car.class);
	System.out.println(car);
	
	Car car1 = applicationContext.getBean("getCar1",Car.class);
	System.out.println(car1);
}
}
