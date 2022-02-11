package com.te.hibernate.jpa.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "emp_table")
public class Employee implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "emp_id")
	private int empId;

	@Column(name = "emp_name")
	private String empName;

	@Column(name = "emp_phone_number")
	private long empPhonenumber;

	public Employee() {
		super();
	}

	public Employee(String empName, long empPhonenumber) {
		super();
		this.empName = empName;
		this.empPhonenumber = empPhonenumber;
	}

	public int getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public long getEmpPhonenumber() {
		return empPhonenumber;
	}

	public void setEmpPhonenumber(long empPhonenumber) {
		this.empPhonenumber = empPhonenumber;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empPhonenumber=" + empPhonenumber + "]";
	}
}
