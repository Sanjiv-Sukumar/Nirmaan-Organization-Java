package com.nirmaan.StudentAddressApplication.controllers;

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

import com.nirmaan.StudentAddressApplication.entities.Student;
import com.nirmaan.StudentAddressApplication.services.studentService;

@RestController
@RequestMapping("student")
public class studentController {

	@Autowired
	studentService ser;
	
	@PostMapping("addStudent")
	public Student addStudent(@RequestBody Student std) {
		return ser.addStudent(std);
	}
	
	@GetMapping("getStudents")
	public List<Student> getCourses(){
		return ser.getStudents();
	}
	
	@PutMapping("updateStudent/{id}")
	public Student updateStudent(@PathVariable int id , @RequestBody Student std) {
		return ser.updateStudent(id, std);
	}
	
	@GetMapping("getStudent/{id}")
	public Student getStudentById(@PathVariable int id) {
		return ser.getStudentById(id);
	}
	
	
	@DeleteMapping("DeleteStudent/{id}")
	public String deleteStudent(@PathVariable int id) {
		ser.deleteStudent(id);
		return "Deleted";
	}
	
}
