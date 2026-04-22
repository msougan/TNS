package com.example.SFBatchCRUD.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SFBatchCRUD.entity.Student;

public interface StudentRepo extends JpaRepository<Student,Integer>{

	
	
}
