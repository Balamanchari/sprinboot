package com.employe.example.Service;

import org.springframework.stereotype.Component;

import com.employe.example.model.Employe;

@Component
public interface EmployeService {
	
	public Employe SaveEmploye(Employe employe);
	public Employe findByEmployeId(int EmployeId);

}
