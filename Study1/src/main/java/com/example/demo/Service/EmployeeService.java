package com.example.demo.Service;

import java.util.List;

import com.example.demo.model.Employee;

public interface EmployeeService {

	void registerEmployee(Employee emp);

	List<Employee> getAllEmpData();

	void editEmpData(Employee emp);
	
	Employee getSingleEmpData(int id);
	
	void deleteEmpData(int id);
}
