package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Student;

public interface StudentService {
	
	void addStudentData(Student student);

	List<Student> getLoginData(String uname, String pass);
	
	Student getSingleEmployee(int id); 

	List<Student> getUpdatedData(Student student);

	List<Student> getDeletedData(int id);
}
