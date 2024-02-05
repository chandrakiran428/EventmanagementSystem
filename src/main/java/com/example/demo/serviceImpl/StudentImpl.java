package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Entity.Student;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;

@Service
public class StudentImpl implements StudentService {

	private StudentRepository studentrepository;
	
	public StudentImpl(StudentRepository studentrepository) {
		super();
		this.studentrepository = studentrepository;
	}



	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return studentrepository.findAll();
	}



	@Override
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		return studentrepository.save(student);
	}

}
