package com.example.demo.model;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;

 
@Entity

public class lapmodel {
	@Id
	public int laptopmodelno;
	public String laptopname;
	public String laptopmodel;
	public String laptopstorage;
	public int getLaptopmodelno() {
		return laptopmodelno;
	}
	public void setLaptopmodelno(int laptopmodelno) {
		this.laptopmodelno = laptopmodelno;
	}
	public String getLaptopname() {
		return laptopname;
	}
	public void setLaptopname(String laptopname) {
		this.laptopname = laptopname;
	}
	public String getLaptopmodel() {
		return laptopmodel;
	}
	public void setLaptopmodel(String laptopmodel) {
		this.laptopmodel = laptopmodel;
	}
	public String getLaptopstorage() {
		return laptopstorage;
	}
	public void setLaptopstorage(String laptopstorage) {
		this.laptopstorage = laptopstorage;
	}
}

	
	
	
	


