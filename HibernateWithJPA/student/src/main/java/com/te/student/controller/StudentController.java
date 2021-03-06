package com.te.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.te.student.bean.StudentDetails;
import com.te.student.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService service;
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@PostMapping("/login")
	public String logedIn(int rollno,String password,ModelMap map) {
		StudentDetails details = service.login(rollno, password);
		if (details != null) {
			return "welcome";
		} else {
			map.addAttribute("errMsg", "Invalid Input");
			return "login";
		}
		
	}
}
