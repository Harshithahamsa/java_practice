package com.te.springcoredemo.bean;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeLaptop implements Serializable{
	private int employeeId;
	private String employeeName;
	private Laptop laptop;
}
