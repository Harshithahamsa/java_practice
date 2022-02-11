package com.te.annotationjava.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.te.annotationjava.interfaces.Animal;
import com.te.annotationjava.interfaces.Cat;
import com.te.annotationjava.interfaces.Dog;

@Configuration
public class AnimalConfig {
	
	@Bean("dog")
	public Animal getDog() {
		return new Dog();
		
	}
	
	@Bean("cat")
//	@Primary
	public Animal getCat() {
		return new Cat();
		
	}
}
