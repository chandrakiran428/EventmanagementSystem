package com.example.demo.service;

import java.util.List;

import com.example.demo.Entity.Student;

public interface StudentService {

	List<Student> getAllStudents();
	
	Student saveStudent(Student student);
}
