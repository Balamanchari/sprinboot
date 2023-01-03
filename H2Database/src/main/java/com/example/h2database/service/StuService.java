package com.example.h2database.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.h2database.model.Student;
import com.example.h2database.repository.StuRepository;

@Service
public class StuService {
	
	@Autowired
	StuRepository repo;
	
	public void saveOrUpdate(Student student)   
	{  
	repo.save(student);  
	}  


}
