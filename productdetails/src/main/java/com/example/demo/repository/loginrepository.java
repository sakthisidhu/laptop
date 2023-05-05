package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.loginmodel;

public interface loginrepository extends JpaRepository<loginmodel, Integer> {
	loginmodel findByuname(String uname);
}


