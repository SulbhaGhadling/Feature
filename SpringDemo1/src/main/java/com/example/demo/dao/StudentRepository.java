package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;
import com.example.demo.model.Student;

import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer>{

}
