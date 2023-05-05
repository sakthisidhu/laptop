package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.email;

public interface emailrepo extends JpaRepository<email, Integer> {

}
