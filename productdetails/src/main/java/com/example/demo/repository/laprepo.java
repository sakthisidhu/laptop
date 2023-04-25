package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.lapmodel;

public interface laprepo extends JpaRepository<lapmodel, Integer> {

}
