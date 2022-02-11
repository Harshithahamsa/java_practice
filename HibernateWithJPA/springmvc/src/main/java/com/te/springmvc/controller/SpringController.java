package com.te.springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.te.springmvc.bean.EmployeeLogin;

@Controller
public class SpringController {
	
	@RequestMapping(path = "/name")
	public String name(Model model) {
		model.addAttribute("name", "Deepankar");
		return "name";	
	}
	
	@GetMapping(path = "/name1")
	public ModelAndView name1(ModelAndView andView) {
		andView.addObject("name", "Bhupati");
		andView.setViewName("name");
		return andView;
	}
	
	@RequestMapping(path = "/friends")
	public String friend(Model model) {
		List<String> list = new ArrayList<String>();
		list.add("Deepankar");
		list.add("Anil");
		list.add("Bhupati");
		list.add("Sankar");
		model.addAttribute("friends", list);
		return "friends";
	}
	
	@RequestMapping(path = "/login")
	public String login() {
		return "login";
	}
	
	@PostMapping("/loginshow")
	public String loginshow(HttpServletRequest httpServletRequest, Model model) {
		String string = httpServletRequest.getParameter("user");
		String string2 = httpServletRequest.getParameter("pass");
		
		model.addAttribute("username", string);
		model.addAttribute("password", string2);
		
		return "loginshow";
		
	}
	
	// 1st way of 
	@PostMapping("/loginshow1")
	public String loginShow(@RequestParam("user") String string,@RequestParam("pass") String string2,Model model) {
		model.addAttribute("username", string);
		model.addAttribute("password", string2);
		return "loginshow";
	}
	
	@PostMapping("/loginshow2")
	public String loginShowTwo(@RequestParam String user,@RequestParam String pass,Model model) {
		model.addAttribute("username", user);
		model.addAttribute("password", pass);
		return "loginshow";
	}
	
	@PostMapping("/loginshow3")
	public String loginShowThree(String user, String pass,Model model) {
		model.addAttribute("username", user);
		model.addAttribute("password", pass);
		return "loginshow";
	}
	
	@PostMapping("/loginshow4")
	public String loginShowFour(EmployeeLogin employeeLogin,ModelMap map) {
		map.addAttribute("logindata", employeeLogin);
		return "getdata";
	}
}
