package com.nirmaan.studentAddress.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nirmaan.studentAddress.entities.Student;
import com.nirmaan.studentAddress.repositories.studentRepo;

@Service
public class studentService{
 
	@Autowired
	studentRepo repo;
	
	public Student addStudent(Student std) {
	
		
		return repo.save(std);
		
	}
	
	public List<Student> getStudents(){
		
		
		return repo.findAll();
		
	}
	
	public Student updateStudent(int id , Student std) {
		std.setId(id);
		return repo.save(std);
	}
	
	public String deleteStudent(int id) {
		repo.deleteById(id);
		return "Deleted";
	}
	
	public Student getStudentById(int id) {
		
		return repo.findById(id).get();
	}
}
