package com.example.demo.service;
 
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
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
	public Optional<lapmodel> getInfo(int id)
	{
		return prepo.findById(id);
	}
	public lapmodel updateInfo(lapmodel pm)
	{
		return prepo.saveAndFlush(pm);
	}
	public void deleteInfo(int id)
	{
		prepo.deleteById(id);
	}
	public List<lapmodel>sortDesc(String pname)
		{
			return prepo.findAll(Sort.by(pname).ascending());
		}
	public List<lapmodel>sortDesc1(String pname)
		{
			return prepo.findAll(Sort.by(pname).descending());
		}
	public List<lapmodel>paginationData(int pageno,int pagesize)
		{
			Page<lapmodel> p=prepo.findAll(PageRequest.of(pageno, pagesize));
			return p.getContent();
		}
	public List<lapmodel>paginationAndSorting(int pageNu,int pageSize,String pname)
		{
			Page<lapmodel>p=prepo.findAll(PageRequest.of(pageNu, pageSize,Sort.by(pname).ascending()));
			return p.getContent();
		}
}

