package com.mycompany.info.domain;

import javax.persistence.Entity;

@Entity
public class DepartmentDetails {

	private int    departmentId;   
	private String name ;
	
	
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
