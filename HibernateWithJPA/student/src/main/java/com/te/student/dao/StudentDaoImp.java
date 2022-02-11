package com.te.student.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.stereotype.Repository;

import com.te.student.bean.StudentDetails;

@Repository
public class StudentDaoImp implements StudentDao {

	@Override
	public StudentDetails login(int rollno, String password) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("student");
		EntityManager manager = factory.createEntityManager();

		StudentDetails details = manager.find(StudentDetails.class, rollno);
		
		if (details != null) {
			if (details.getPassword().equals(password)) {
				return details;
			}
		}
		return null;
	}

}
