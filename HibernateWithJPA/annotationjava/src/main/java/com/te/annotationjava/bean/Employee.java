package com.te.annotationjava.bean;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;


@Data
//If you pass any name than the name become bean class
@Component("employeeNew")
public class Employee implements Serializable{
	@Value("100")
	private int id;
	@Value("Deepankar")
	private String name;
	@Autowired
	private Laptop laptop;
}
