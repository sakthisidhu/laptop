package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.lapmodel;
import com.example.demo.repository.laprepo;

@Service

public class lapservice {
	@Autowired
	public laprepo prepo;
	
	public  lapmodel Saveinfo(lapmodel pm)
	{
		return prepo.save(pm);
	}
	public List<lapmodel> getInfo()
	{
		return prepo.findAll();
	}
	public lapmodel updateInfo(lapmodel pu)
	{
		return prepo.saveAndFlush(pu);
	}
	public void deleteInfo(int id)
	
		{
			prepo.deleteById(id);
		}
	}


