package com.te.annotationjava.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.te.annotationjava.bean.Car;
import com.te.annotationjava.bean.Engine;

@Configuration
public class CarConfig {
	
	@Bean("engine1")
	@Primary
	public Engine getEngine() {
		Engine engine = new Engine();
		engine.setEngineName("Yamaha");
		engine.setEngineCc(1000);
		return engine;
	}
	
	@Bean("engine2")
	public Engine getEngine1() {
		Engine engine = new Engine();
		engine.setEngineName("Sujuki");
		engine.setEngineCc(2000);
		return engine;
	}
	
	@Bean
	
	public Car getCar() {
		Car car = new Car();
		car.setCarName("Audi");
		car.setCarNo("ka-01-0001");
		
		return car;
	}
	
	@Bean
	
	public Car getCar1() {
		Car car = new Car();
		car.setCarName("Audi");
		car.setCarNo("ka-01-0001");
		
		return car;
	}
}
