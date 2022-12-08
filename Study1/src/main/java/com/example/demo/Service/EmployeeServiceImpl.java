package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.repo.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository er;

	@Override
	public void registerEmployee(Employee emp) {

		er.save(emp);
	}

	@Override
	public List<Employee> getAllEmpData() {
		return er.findAll();
	}

	@Override
	public void editEmpData(Employee emp) {
		er.save(emp);
	}

	@Override
	public Employee getSingleEmpData(int id) {
		return er.findById(id).get();
	}


	@Override
	public void deleteEmpData(int id) {
		er.deleteById(id); 
		
	}

}
