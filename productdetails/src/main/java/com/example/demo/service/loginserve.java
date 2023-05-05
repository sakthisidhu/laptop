package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.loginmodel;
import com.example.demo.repository.loginrepository;

@Service
public class loginserve {
	@Autowired
	public loginrepository lrepo;
	 
	public String checkLogin(String uname,String pwd)
	{
		loginmodel user=lrepo.findByuname(uname);
		if(user==null)
		{
			return "no user found";
		}
		else {
			if(user.getPwd().equals(pwd))
			{
				return "Login Succesful";
			}
			else
			{
				return "Login failed";
			}
		}
	}
	public loginmodel adduser(loginmodel game)
	{
		return lrepo.save(game);
	}
	public List<loginmodel> getuser()
	{
		return lrepo.findAll();
	}

}
