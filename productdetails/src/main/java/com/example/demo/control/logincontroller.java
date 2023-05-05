package com.example.demo.control;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
 
import com.example.demo.model.loginmodel;
import com.example.demo.service.loginserve;

@RestController
public class logincontroller {
	@Autowired
	public loginserve lserve;
	
	@PostMapping("/login")
	public String login(@RequestBody Map<String,String> loginData)
	{
		String uname=loginData.get("uname");
		String pwd=loginData.get("pwd");
		String result=lserve.checkLogin(uname,pwd);
		return result;
	}
	@PostMapping("/adduser")
	public loginmodel addUser(@RequestBody loginmodel l)
	{
		return lserve.adduser(l);
	}
	@GetMapping("/getlogin")
	public List<loginmodel> getAll()
	{
		return lserve.getuser();
	}
}