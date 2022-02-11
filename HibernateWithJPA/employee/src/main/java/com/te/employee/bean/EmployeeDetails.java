package com.te.employee.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "emp_info")
public class EmployeeDetails implements Serializable {
	@Id
	@Column(name = "e_id")
	private int id;
	@Column(name = "e_username")
	private String user;
	@Column(name = "e_name")
	private String name;
	@Column(name = "e_address")
	private String address;
	@Column(name = "e_password")
	private String password;
}
