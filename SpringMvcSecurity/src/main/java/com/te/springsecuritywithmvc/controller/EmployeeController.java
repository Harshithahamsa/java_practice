package com.te.springsecuritywithmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.te.springsecuritywithmvc.dto.EmployeeDetails;
import com.te.springsecuritywithmvc.service.EmployeeServiceImp;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeServiceImp serviceImp;

	@GetMapping("/")
	public String home() {
		return "home";
	}

	@GetMapping("/add")
	public String addData() {
		return "addform";
	}

	@PostMapping("/add")
	public String addData(ModelMap map, EmployeeDetails details) {
		EmployeeDetails details2 = serviceImp.addEmployee(details);
		if (details2 != null) {
			map.addAttribute("msg", "Data added successfully");
		} else {
			map.addAttribute("msg", "Something Went Worng.");
		}
		return "addform";
	}

	@GetMapping("/delete")
	public String DeleteData() {

		return "delete";

	}

	@PostMapping("/delete")
	public String deletedata(int empId, ModelMap map) {

		if (serviceImp.deleteEmployee(empId)) {
			map.addAttribute("data", "deleted successfully");
			return "delete";
		} else {
			map.addAttribute("data", "id not found");
			return "delete";
		}

	}

	@GetMapping("/update")
	public String update() {

		return "update";

	}

	@PostMapping("/update")
	public String updateData(ModelMap map, EmployeeDetails details) {
		EmployeeDetails details2 = serviceImp.updateEmplee(details);
		if (details2 != null) {
			map.addAttribute("msg", "Data Updated Successfully");
		} else {
			map.addAttribute("msg", "Something Went Wrong");
		}

		return "update";

	}

	@GetMapping("/welcome")
	public String welcome() {
		return "welcome";
	}

	@GetMapping("/logout")
	public String logout() {
		return "home";
	}
}
