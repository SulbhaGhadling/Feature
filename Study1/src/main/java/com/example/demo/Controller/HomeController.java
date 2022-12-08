package com.example.demo.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.EmployeeService;
import com.example.demo.model.Employee;

@RestController
public class HomeController {

	@Autowired
	EmployeeService es;

	@PostMapping(value = "/empreg")
	public Employee register(@RequestBody Employee emp) {
		es.registerEmployee(emp);
		return emp;
	}

	@GetMapping(value = "/getallempdata")
	public List<Employee> getAllEmpData() {
		List<Employee> elist = new ArrayList<Employee>();
		elist = es.getAllEmpData();
		return elist;
	}

	@PostMapping(value = "/editempdata")
	public String editEmpData(@RequestBody Employee emp) {
		es.editEmpData(emp);
		return "Employee data updated successfully.";
	}
	
	@GetMapping(value = "/getsingleemp")
	public Employee getSingleEmpData(@RequestParam int id) {
		Employee e = es.getSingleEmpData(id);
		return e;
	}
	
	@PostMapping(value = "/deleteempdata")
	public String deleteEmpData(@RequestParam int id) {
		es.deleteEmpData(id);
		return "Employee data of given id is deleted successfully.";
	}
}
