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
@Table(name="depart")
public class Depart {
	  @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	  private int deptid;
	  private String deptname;
	  
	  public int getDeptid() {
		return deptid;
	}

	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}

	public String getDeptname() {
		return deptname;
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	
	 @OneToOne(cascade = CascadeType.ALL)
	    @JsonManagedReference
	    private Employe employe;
}
