package com.te.annotationjava.bean;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Laptop implements Serializable{
	@Value("Dell")
	private String laptopName;
	@Value("50000")
	private Integer laptopPrice;
	
}
