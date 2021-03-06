package com.te.employee.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import javax.persistence.PersistenceUnit;
import javax.persistence.Query;


import org.springframework.stereotype.Repository;

import com.te.employee.bean.EmployeeDetails;

import com.te.employee.exception.EmployeeException;

@Repository
public class EmployeeDbImpl implements EmployeeDb {

	@PersistenceUnit
	private EntityManagerFactory factory;

	@Override
	public EmployeeDetails login(int id, String password) {
//		EntityManagerFactory factory = Persistence.createEntityManagerFactory("emp");
		EntityManager manager = factory.createEntityManager();

		EmployeeDetails details = manager.find(EmployeeDetails.class, id);
		if (details != null) {
			if (details.getPassword().equals(password)) {
				return details;
			} else {
				throw new EmployeeException("Password Worng, Please right enter correct Password");
			}
		}
		throw new EmployeeException("Invalid ID");
	}

	@Override
	public boolean addEmp(EmployeeDetails details) {
		EntityTransaction transaction = null;
		boolean isAdded = false;

		try {
//			EntityManagerFactory factory = Persistence.createEntityManagerFactory("emp");
			EntityManager manager = factory.createEntityManager();

			transaction = manager.getTransaction();

			transaction.begin();
			manager.persist(details);
			transaction.commit();
			isAdded = true;

		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
		}

		return isAdded;
	}

	@Override
	public boolean deleteData(int id) {
		EntityTransaction transaction = null;
		boolean isDeleted = false;
		try {
//			EntityManagerFactory factory = Persistence.createEntityManagerFactory("emp");
			EntityManager manager = factory.createEntityManager();
			transaction = manager.getTransaction();

			transaction.begin();
			EmployeeDetails details = manager.find(EmployeeDetails.class, id);

			manager.remove(details);
			transaction.commit();
			isDeleted = true;

		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
		}

		return isDeleted;
	}

	@Override
	public EmployeeDetails getData(int id) {
//		EntityManagerFactory factory = Persistence.createEntityManagerFactory("emp");
		EntityManager manager = factory.createEntityManager();
		EmployeeDetails details = manager.find(EmployeeDetails.class, id);
		if (details != null) {
			return details;
		} else {
			return null;
		}

	}

	@Override
	public List<EmployeeDetails> allEmpData() {
//		EntityManagerFactory factory = Persistence.createEntityManagerFactory("emp");
		EntityManager manager = factory.createEntityManager();

		Query query = manager.createQuery("From EmployeeDetails");

		List<EmployeeDetails> list = query.getResultList();

		return list;
	}

	@Override
	public boolean updateData(EmployeeDetails details, int id) {
		EntityTransaction transaction = null;
		boolean isUpdated = false;

		try {
//			EntityManagerFactory factory = Persistence.createEntityManagerFactory("emp");
			EntityManager manager = factory.createEntityManager();
			transaction = manager.getTransaction();

			transaction.begin();
			EmployeeDetails details2 = manager.find(EmployeeDetails.class, id);
			if (details2 != null) {
				details2.setName(details.getName());
				details2.setUser(details.getUser());
				details2.setAddress(details.getAddress());
				details2.setPassword(details.getPassword());
			}
			
			manager.persist(details2);
			transaction.commit();
			isUpdated = true;
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
		}
		return isUpdated;
	}

}
