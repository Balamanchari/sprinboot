package com.employe.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employe.example.model.Employe;

public interface EmployeeRepo extends JpaRepository<Employe,Integer> {
    public Employe findByEmployeId(int EmployeId);

}
