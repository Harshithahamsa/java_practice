package com.te.springcoredemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.te.springcoredemo.bean.Car;

public class CarMainTest {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("referenceconfig.xml");
		Car car = (Car) applicationContext.getBean("car");
		System.out.println(car);
		
		System.out.println(car.getCarName());
		System.out.println(car.getCarNo());
		System.out.println(car.getEngine().getEngineName());
		System.out.println(car.getEngine().getEngineCc());
	}
}
