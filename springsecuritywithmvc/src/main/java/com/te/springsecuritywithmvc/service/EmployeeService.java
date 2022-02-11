package com.te.springsecuritywithmvc.service;

import com.te.springsecuritywithmvc.dto.EmployeeDetails;

public interface EmployeeService {
	
	EmployeeDetails addEmployee(EmployeeDetails details);
	
	EmployeeDetails updateEmplee(EmployeeDetails details);
	
	boolean deleteEmployee(int id);
	
}
