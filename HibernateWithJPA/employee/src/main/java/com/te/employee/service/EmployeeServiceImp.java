package com.te.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.employee.bean.EmployeeDetails;
import com.te.employee.dao.EmployeeDb;

@Service
public class EmployeeServiceImp implements EmployeeService {

	@Autowired
	private EmployeeDb dao;

	@Override
	public EmployeeDetails login(int id, String password) {
		if (id <= 0) {
			return null;
		} else {
			return dao.login(id, password);
		}

	}

	@Override
	public Boolean addEmp(EmployeeDetails details) {
		if (details != null) {
			return dao.addEmp(details);
		}else {
			return null;
		}

	}

	@Override
	public boolean deleteData(int id) {
		if (id <= 0) {
			return false;
		} else {
			return dao.deleteData(id);
		}
	}

	@Override
	public EmployeeDetails getData(int id) {
		if (id <= 0) {
			return null;
		} else {
			return dao.getData(id);
		}
	}

	@Override
	public List<EmployeeDetails> allEmpData() {
		return dao.allEmpData();
	}



	@Override
	public boolean updateData(EmployeeDetails details, int id) {
		return dao.updateData(details, id);
	}

	

}
