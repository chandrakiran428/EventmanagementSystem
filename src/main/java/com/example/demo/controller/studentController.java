package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.Entity.Student;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;

@Controller
public class studentController implements CommandLineRunner {
  
	private StudentService studentservice;

	public studentController(StudentService studentservice) {
		super();
		this.studentservice = studentservice;
	}
	
	
	
	@GetMapping("/students")
	public String listStudents(Model model) {
		model.addAttribute("students", studentservice.getAllStudents()); //check this
		
		return "students.html";
	}
	
	@GetMapping("/students/new")
	public String createStudent(Model model) {
		
		//holding the student obj
		Student student = new Student();
		model.addAttribute("student", student);
		return "createStudent";
	}
	
	@PostMapping("/students")
	public String saveStudent(@ModelAttribute("student") Student student) {
		studentservice.saveStudent(student);
		return "redirect:/students";
	}

	@Autowired
    private StudentRepository studentrepository;
   
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		Student s1 = new Student(1,"John","miller" ,"miller@email.com");studentrepository.save(s1);
//		Student s2 = new Student(2,"John","miller" ,"miller@email.com");studentrepository.save(s2);
//		Student s3 = new Student(3,"John","miller" ,"miller@email.com");studentrepository.save(s3);
//		Student s4 = new Student(4,"John","miller" ,"miller@email.com");studentrepository.save(s4);
//		Student s5 = new Student(5,"John","miller" ,"miller@email.com");studentrepository.save(s5);
	  	
	}
	
}
