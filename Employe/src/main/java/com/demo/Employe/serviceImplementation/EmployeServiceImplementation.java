package com.demo.Employe.serviceImplementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.Employe.model.Employe;
import com.demo.Employe.repository.EmployeRepo;
import com.demo.Employe.service.EmployeService;

@Service
public class EmployeServiceImplementation implements EmployeService{

	@Autowired
	EmployeRepo emprepo;

	@Override
	public Employe createdata(Employe employe) {
		emprepo.save(employe);
		return employe;
	}
	
	
}
