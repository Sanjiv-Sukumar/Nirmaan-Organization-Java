package com.nirmaan.studentAddress.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nirmaan.studentAddress.entities.Student;
import com.nirmaan.studentAddress.services.studentService;

@RestController
@RequestMapping("student")
public class studentController {

	@Autowired
	studentService stdSer;
	
	@PostMapping("addStudent")
	public Student addAddress(@RequestBody Student std) {
		return stdSer.addStudent(std);
	}
	
	@GetMapping("getStudents")
	public List<Student> getStudents(){
		return stdSer.getStudents();
	}
	
	@PutMapping("updateStudent/{id}")
	public Student updateStudent(@PathVariable int id ,@RequestBody Student std) {
		return stdSer.updateStudent(id, std);
	}
	
	@DeleteMapping("deleteStudent/{id}")
	public String deleteAddress(@PathVariable int id) {
		
		return stdSer.deleteStudent(id);
	}
	
	@GetMapping("getStudent/{id}")
	public Student getStudent(@PathVariable int id) {
		return stdSer.getStudentById(id);
	}
}
