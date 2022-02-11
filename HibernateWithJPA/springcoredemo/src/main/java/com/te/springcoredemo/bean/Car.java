package com.te.springcoredemo.bean;

import java.io.Serializable;

import lombok.Data;

@Data
public class Car implements Serializable{
	private String carName;
	private String carNo;
	private Engine engine;
}
