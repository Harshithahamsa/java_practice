package com.te.student.service;

import com.te.student.bean.StudentDetails;

public interface StudentService {
	public StudentDetails login(int rollno, String password);
}
