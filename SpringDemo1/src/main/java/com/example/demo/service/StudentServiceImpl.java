package com.example.demo.service;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.dao.StudentRepository;
import com.example.demo.model.Student;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	StudentRepository sr;
	
//	@Autowired
//	SessionFactory sf;

	@Override
	public void addStudentData(Student student) {
		sr.save(student);
		
	}

	@Override
	public List<Student> getLoginData(String uname, String pass) {
		
		return (List<Student>) sr.findAll();
	}

	@Override
	public Student getSingleEmployee(int id) {
		
		return sr.findById(id).get();
	}

	@Override
	public List<Student> getUpdatedData(Student student) {
		sr.save(student);

		return (List<Student>) sr.findAll();
	}

	@Override
	public List<Student> getDeletedData(int id) {
		sr.deleteById(id);
		return (List<Student>) sr.findAll(); 
	}

}
