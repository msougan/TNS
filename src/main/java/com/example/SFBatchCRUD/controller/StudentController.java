package com.example.SFBatchCRUD.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.SFBatchCRUD.entity.Student;
import com.example.SFBatchCRUD.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	public StudentService stdser;
	
	@PostMapping("/addStud")
	public Student addStud(@RequestBody Student std) {
		return stdser.studinsert(std);	
	}
	
	@GetMapping("/getstudent")
	public List<Student> getStudent(){
		
		return stdser.getStudent();
	}
	
	@DeleteMapping("/deleteStudent/{id}")
	public void deleteStudent(@PathVariable Integer id) {
		
		stdser.deleteStudent(id);
	}
	
	@PutMapping("/updateStudent")
	public Student updateStudent(@RequestBody Student std) {
		
		return stdser.updateStudent(std);
	}

}
