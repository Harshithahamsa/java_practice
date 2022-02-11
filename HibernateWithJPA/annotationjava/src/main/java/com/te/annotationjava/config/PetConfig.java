package com.te.annotationjava.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.te.annotationjava.bean.Pet;

@Configuration
public class PetConfig {
	
	@Bean("pet1")
	
	public Pet getPet() {
		Pet pet = new Pet();
		pet.setP_name("Kobe");
		return pet;
	}
	
	@Bean("pet2")
	public Pet getPet1() {
		Pet pet = new Pet();
		pet.setP_name("MAX");
		return pet;
	}
}
