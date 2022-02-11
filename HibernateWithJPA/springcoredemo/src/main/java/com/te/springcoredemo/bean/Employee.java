package com.te.springcoredemo.bean;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee implements Serializable{
	private int id;
	private String name;
	private String address;
	
//	public Employee (int id, )
}


