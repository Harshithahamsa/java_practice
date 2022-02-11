package com.te.hibernate.jpa.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Data

@Entity
@Table(name = "emp_table")
public class Employee implements Serializable {

	@Id
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "emp_id")
	private int empId;

	@Column(name = "emp_name")
	private String employee;

	@Column(name = "emp_phone_number")
	private long empPhoneNumber;

	public Employee() {
		super();
	}

	public Employee(String employee, long empPhoneNumber) {
		super();
		this.employee = employee;
		this.empPhoneNumber = empPhoneNumber;
	}

	

}
