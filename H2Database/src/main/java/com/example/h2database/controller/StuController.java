package com.example.h2database.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.h2database.model.Student;
import com.example.h2database.service.StuService;

@RestController
public class StuController {

	@Autowired
	StuService serv; 
	
	@PostMapping("/student")  
	private String saveStudent(@RequestBody Student student)   
	{  
	serv.saveOrUpdate(student);  
	return "data saved";  
	}
	
}
