package com.te.employee.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.te.employee.bean.EmployeeDetails;
import com.te.employee.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService service;

	@GetMapping("/login")
	public String login() {
		return "login";
	}

	@PostMapping("/login")
	public String auth(int id, String password, ModelMap map, HttpServletRequest request) {
		EmployeeDetails details = service.login(id, password);
		HttpSession session = request.getSession();
		session.setAttribute("loggedIn", details);
		if (details != null) {
			map.addAttribute("data", details.getName());
			return "welcome";
		} else {
			map.addAttribute("errMessage", "Invalid Credencial");
			return "login";
		}

	}

	@GetMapping("/add")
	public String addEmp(@SessionAttribute(name = "loggedIn", required = false) EmployeeDetails details, ModelMap map) {
		if (details != null) {
			return "addForm";
		} else {
			map.addAttribute("errMessage", "Please LogIn First");
			return "login";
		}

	}

	@PostMapping("/add")
	public String addedEmp(EmployeeDetails details, ModelMap map,
			@SessionAttribute(name = "loggedIn", required = false) EmployeeDetails details2) {
		if (details2 != null) {
			if (service.addEmp(details)) {
				map.addAttribute("msg", "Data Inserted Successfully");
			} else {
				map.addAttribute("errmsg", "Data is not added");
			}
			return "addForm";
		} else {
			map.addAttribute("errMessage", "Please LogIn First");
			return "login";
		}
	}

	@GetMapping("/delete")
	public String delete(@SessionAttribute(name = "loggedIn", required = false) EmployeeDetails details, ModelMap map) {
		if (details != null) {
			return "deleteform";
		} else {
			map.addAttribute("errMessage", "Please LogIn First");
			return "login";
		}
	}

	@PostMapping("/logout")
	public String deleteData(int id, ModelMap map,
			@SessionAttribute(name = "loggedIn", required = false) EmployeeDetails details) {
		if (details != null) {
			if (service.deleteData(id)) {
				map.addAttribute("msg", "Data deleted successfully");

			} else {
				map.addAttribute("msg", "Data is present for Id : " + id);

			}
			return "deleteform";
		} else {
			map.addAttribute("errMessage", "Please LogIn First");
			return "login";
		}
	}

	@GetMapping("/getemp")
	public String getForm(@SessionAttribute(name = "loggedIn", required = false) EmployeeDetails details,
			ModelMap map) {
		if (details != null) {
			return "getForm";
		} else {
			map.addAttribute("errMessage", "Please LogIn First");
			return "login";
		}
	}

	@PostMapping("/getdata")
	public String getData(int id, ModelMap map,
			@SessionAttribute(name = "loggedIn", required = false) EmployeeDetails details2) {
		if (details2 != null) {
			EmployeeDetails details = service.getData(id);
			if (details != null) {
				map.addAttribute("data", details);
			} else {
				map.addAttribute("errmsg", "Id is not Present");
			}
			return "getForm";
		} else {
			map.addAttribute("errMessage", "Please LogIn First");
			return "login";
		}

	}

	@GetMapping("/allemp")
	public String allEmployee(ModelMap map,
			@SessionAttribute(name = "loggedIn", required = false) EmployeeDetails details) {
		if (details != null) {
			List<EmployeeDetails> details2 = service.allEmpData();
			if (details2 != null) {
				map.addAttribute("alldata", details2);
			} else {
				map.addAttribute("err", "No Data is Present");
			}
			return "allemp";
		} else {
			map.addAttribute("errMessage", "Please LogIn First");
			return "login";
		}
	}

	@GetMapping("/update")
	public String update(ModelMap map, @SessionAttribute(name = "loggedIn", required = false) EmployeeDetails details) {
		if (details != null) {
			map.addAttribute("data", details);
			return "update";
		} else {
			map.addAttribute("errMessage", "Please LogIn First");
			return "login";
		}
	}

	@PostMapping("/update")
	public String updateData(ModelMap map,
			@SessionAttribute(name = "loggedIn", required = false) EmployeeDetails sessionDetails,
			EmployeeDetails details) {
		if (sessionDetails != null) {
			if (service.updateData(details, sessionDetails.getId())) {

				map.addAttribute("msg", "Data updated Successfully");
			} else {
				map.addAttribute("msg", "Something Went Worng");
			}
			return "updateform";
		} else {
			map.addAttribute("errMessage", "Please LogIn First");
			return "login";
		}
	}

	@GetMapping("/logout")
	public String logout(ModelMap map, HttpSession session) {
		map.addAttribute("errMessage", "Logout Successfully");
		session.invalidate();
		return "login";
	}
}
