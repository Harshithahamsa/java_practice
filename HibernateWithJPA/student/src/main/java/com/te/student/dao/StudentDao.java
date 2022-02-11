package com.te.student.dao;

import com.te.student.bean.StudentDetails;

public interface StudentDao {
	
	public StudentDetails login(int rollno, String password);

}
