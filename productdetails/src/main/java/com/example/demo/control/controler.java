package com.example.demo.control;

import java.util.List;
import java.util.Optional;

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
	@GetMapping("/getpk/{pid}")
	public Optional<lapmodel> getDetails(@PathVariable int pid)
	{
		return pserve.getInfo(pid);
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
	@GetMapping("/sortDesc/{playername}")
	public List<lapmodel>sortplayer(@PathVariable("playername")String pname)
	{
		return pserve.sortDesc(pname);
	}
	@GetMapping("/sortDesc1/{playername}")
	public List<lapmodel>sortplayer1(@PathVariable("playername")String pname)
	{
		return pserve.sortDesc1(pname);
	}
	@GetMapping("/pagination/{pid}/{height}")
	public List<lapmodel>paginationData(@PathVariable("pid")int playerId,@PathVariable("height")int height)
	{
		return pserve.paginationData(playerId,height);
	}
	@GetMapping("/pag/{nu}/{siz}/{name}")
	public List<lapmodel>pagina(@PathVariable("nu")int nu,@PathVariable("siz")int siz,@PathVariable("name")String name)
	{
		return pserve.paginationAndSorting(nu,siz,name);
	}
} 


