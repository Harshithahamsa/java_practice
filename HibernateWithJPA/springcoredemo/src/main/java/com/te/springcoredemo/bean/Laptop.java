package com.te.springcoredemo.bean;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
//@AllArgsConstructor
//@NoArgsConstructor

public class Laptop implements Serializable{
	private String laptopName;
	private int laptopPrice;
	
	
}
