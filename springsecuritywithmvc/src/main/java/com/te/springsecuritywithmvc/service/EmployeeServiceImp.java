package com.te.springsecuritywithmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.te.springsecuritywithmvc.dao.EmployeeDao;
import com.te.springsecuritywithmvc.dto.EmployeeDetails;
import com.te.springsecuritywithmvc.dto.MyEmployeeDetails;

@Service
public class EmployeeServiceImp implements UserDetailsService,EmployeeService{

	@Autowired
	private EmployeeDao dao;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		EmployeeDetails details = dao.findByUserName(username);
		if (details != null) {
			return new MyEmployeeDetails(details);
		} else {
			throw new UsernameNotFoundException("Employee Not Found !!");
		}
	}

	@Override
	public EmployeeDetails addEmployee(EmployeeDetails details) {
		return dao.save(details);
	}

	@Override
	public EmployeeDetails updateEmplee(EmployeeDetails details) {
		
		return dao.save(details);
	}

	@Override
	public boolean deleteEmployee(int id) {
		if(id>0) {
			EmployeeDetails details=dao.findByEmpId(id);
			if(details!=null) {
				dao.deleteById(id);
				return true;
			}else return false;
		}else {
			return false;
		}

		
	}

	

}
