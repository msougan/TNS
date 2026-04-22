package com.example.SFBatchCRUD.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SFBatchCRUD.entity.Student;
import com.example.SFBatchCRUD.repository.StudentRepo;

@Service
public class StudentService {

	@Autowired
	private StudentRepo srepo;
	
	//for insertion
	
	public Student studinsert(Student std) 
	{
		
		return srepo.save(std);
	}
	
	//read
	public List<Student> getStudent(){ 
		 return srepo.findAll();
	}
	
	//delete
	public void deleteStudent(Integer id) {
		
		srepo.deleteById(id);
	}
	
	//update 
	
	public Student updateStudent(Student std) {
		Integer sid =std.getId();
		Student std1=srepo.findById(sid).get();
		std1.setName(std.getName());
		std1.setCollege(std.getCollege());
		std1.setRoll(std.getRoll());
		std1.setQualification(std.getQualification());
		std1.setCourse(std.getCourse());
		std1.setYear(std.getYear());
		std1.setCertificate(std.getCertificate());
		std1.setHallTicketNo(std.getHallTicketNo());
		return srepo.save(std1);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
