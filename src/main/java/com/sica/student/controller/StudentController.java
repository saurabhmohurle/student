package com.sica.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sica.student.entity.StudentEntity;
import com.sica.student.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService student;
	
	@GetMapping("/greet")
	public String greetStudent() {
		return "welcome student";
	}
	
	@PostMapping("/addStudent")
	public String addStudent(@RequestBody StudentEntity s) {
		return student.addStudent(s);
	}
	
	@GetMapping("/getStudents")
	public List<StudentEntity> getStudents(){
		return student.getStudents();
	}
}
