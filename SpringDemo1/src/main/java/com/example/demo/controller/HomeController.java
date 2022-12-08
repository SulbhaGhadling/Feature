package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

@Controller
public class HomeController {

	@Autowired
	StudentService ss;
	
	@RequestMapping(value = "/")
	public String getIndexPage() {
		System.out.println("Called Index page");
	  return "index";
	}
	
	@RequestMapping(value = "/reg")
	public String getRegisterData(@ModelAttribute Student student) {
		System.out.println("Register Data :" + student);
		ss.addStudentData(student);
		return "login";
	}
	
	@RequestMapping(value = "/log")
	public String getLoginData(@RequestParam String uname,@RequestParam String pass, Model m) {
		System.out.println("Login Details : " + uname + "  " + pass);
		List<Student> slist = ss.getLoginData(uname, pass);
		m.addAttribute("list", slist);
		return "success";
	}
	
	@RequestMapping(value = "/up")
	public String getUpdatedData(@ModelAttribute Student student, ModelMap map) {
		System.out.println("Updated Data is : " + student);
		List<Student> list = ss.getUpdatedData(student);
		map.addAttribute("list", list);
		return "success";
	}
	
	@RequestMapping(value = "/edit")
	public String getEditData(@RequestParam int id, ModelMap map) {
		System.out.println("We are calling Edit page here.");
		Student student = ss.getSingleEmployee(id);
		map.addAttribute("us", student);
		return "edit";
	}
	
	@RequestMapping(value = "/del")
	public String getdelteData(@RequestParam int id, ModelMap map) {		
		System.out.println("Deleting Id is : " + id);
		List<Student> list = ss.getDeletedData(id);
		map.addAttribute("list", list);
		return "success";
	}
}
