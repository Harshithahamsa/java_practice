package com.te.annotationjava.bean;

import java.io.Serializable;

import lombok.Data;

@Data
public class Engine implements Serializable{
	private String engineName;
	private int engineCc;
	
}
