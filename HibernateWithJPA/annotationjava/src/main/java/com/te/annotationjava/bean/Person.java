package com.te.annotationjava.bean;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import lombok.Data;

@Data
public class Person implements Serializable{
	private int id;
	private String name;
	@Autowired
	@Qualifier("address1")
	private Address address;
}
