package com.example.demo.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.lapmodel;
import com.example.demo.service.lapservice;

@RestController

public class controler {
	@Autowired
	public lapservice pserve;
	@PostMapping("/savepk")
	public lapmodel addDetails(@RequestBody lapmodel lm)
	{
		return pserve.Saveinfo(lm);
	}
	@GetMapping("/getpk")
	public List<lapmodel> getDetails()
	{
		return pserve.getInfo();
	}
	@PutMapping("/updatepk")
	public lapmodel updateDetails(@RequestBody lapmodel id)
	{
		return pserve.updateInfo(id);
	}
	@DeleteMapping("/deletelap/{pid}")
	public String deleteDetails(@PathVariable("pid")int playerId)
	{
		pserve.deleteInfo(playerId);
		return "player Id "+playerId+" Deleted";
	}
	@DeleteMapping("/deleteBYReq")
	public String deleteByRequestPara(@RequestParam("pid")int playerId)
	{
		pserve.deleteInfo(playerId);
		return "playerId "+playerId+" is deleted";
	}
}
