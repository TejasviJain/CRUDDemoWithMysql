package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> 
{

	

}
