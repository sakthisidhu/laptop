package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.model.employee;
import com.example.demo.repo.noterepo;

@Service
public class serviceclass {
	@Autowired
	public	noterepo cr;
	
	public void post(employee c)
	{
		 cr.save(c);
	}
	public List<employee> get()
	{
		return cr.findAll();
	}
}
