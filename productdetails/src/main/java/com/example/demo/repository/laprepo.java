package com.example.demo.repository;

//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;

import com.example.demo.model.lapmodel;

public interface laprepo extends JpaRepository<lapmodel, Integer> {
//	@Query(value="select * from laptop_details",nativeQuery=true)
//	public List<lapmodel>getAllvalue();
//	
//	@Query(value="select * from laptop_details where laptopmodelno_id=:1",nativeQuery=true)
//	public List<lapmodel>getbyname(@Param("id") int id);

}
