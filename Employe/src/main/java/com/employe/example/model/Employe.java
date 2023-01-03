package com.employe.example.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;


@Entity
@Table(name="employe")
public class Employe {

	 @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	 private int employeId;
   	private String employeName;
   	
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "employe")
    @JsonManagedReference
    private Depart depart;
	 
	 public int getEmployeId() {
		return employeId;
	}

	public void setEmployeId(int employeId) {
		this.employeId = employeId;
	}

	public String getEmployeName() {
		return employeName;
	}

	public void setEmployeName(String employeName) {
		this.employeName = employeName;
	}


}
