package com.review2.project.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.review2.project.Model.StudentModel;
import com.review2.project.Service.StudentService;
@RestController
public class StudentController 
{
	@Autowired
	public StudentService sserv;
	
	@PostMapping("/poststudent")
	
	public StudentModel add(@RequestBody  StudentModel smodel) {
		return sserv.addStudent(smodel);
	}
	
	@GetMapping("/getstudent")
	
	public List<StudentModel> get(){
		return sserv.getStudent();
	}
	
	@PutMapping("/putstudent")
	
	public StudentModel put( @RequestBody  StudentModel smodel) {
		return sserv.putdata(smodel);
	}
	
	@DeleteMapping("/deletestudent")
	
	public String delete( @RequestParam int studentid) {
		 sserv.deletedata(studentid);
		 return studentid+" deleted";
	}

}