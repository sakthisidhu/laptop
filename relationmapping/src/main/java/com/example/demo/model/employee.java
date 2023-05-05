package com.example.demo.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;



@Entity
public class employee {
	@Id
	public int employeeId;
	public String employeename;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="e_id")
	public email em;
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeename() {
		return employeename;
	}
	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}
	public email getEm() {
		return em;
	}
	public void setEm(email em) {
		this.em = em;
	}
	
    
	
	
	


}
