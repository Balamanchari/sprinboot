package com.demo.Employe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.Employe.model.Employe;
import com.demo.Employe.service.EmployeService;

@RestController
public class EmployeController {
	
	@Autowired
	EmployeService employeservice;
	
	@PostMapping("/create")
	public Employe createdata(Employe employe) {
		employeservice.createdata(employe);
		return employe;
		
	}

}
