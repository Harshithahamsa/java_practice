package com.te.springsecuritywithmvc.dao;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;

import com.te.springsecuritywithmvc.dto.EmployeeDetails;

@EnableJpaRepositories
public interface EmployeeDao extends CrudRepository<EmployeeDetails, Integer> {
	public EmployeeDetails findByUserName(String username);

	public EmployeeDetails findByEmpId(int id);
	
	
}
