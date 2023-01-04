package com.demo.Employe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.Employe.model.Employe;

@Repository
public interface EmployeRepo extends JpaRepository<Employe, Integer>{

}
