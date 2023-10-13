package com.sica.student.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sica.student.entity.StudentEntity;
import com.sica.student.entity.StudentRepository;

@Service
public class StudentService {

	@Autowired
	StudentRepository sr;
	
	public String addStudent(StudentEntity student) {
		sr.save(student);
		return "Student added successfully";
	}
	
	public java.util.List<StudentEntity> getStudents(){
		return sr.findAll();
	}
}
