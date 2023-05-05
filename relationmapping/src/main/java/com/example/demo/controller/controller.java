package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.model.employee;
import com.example.demo.service.serviceclass;

@RestController
@RequestMapping("/find")
public class controller {
	@Autowired
	public serviceclass cr;
	
	@PostMapping("/postoo")
	public String post1(@RequestBody employee c)
	{
		 cr.post(c);
		 return "data inserted";
	}
	@GetMapping("/get")
	public List<employee> get1()
	{
		return cr.get();
	}


}
