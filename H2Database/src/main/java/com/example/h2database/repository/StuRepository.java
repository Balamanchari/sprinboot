package com.example.h2database.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.h2database.model.Student;

@Repository

public interface StuRepository extends JpaRepository<Student, Long> {

}
