package com.nirmaan.springAssessment.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.nirmaan.springAssessment.entities.Student;
import com.nirmaan.springAssessment.repositories.studentRepo;

@Service
public class studentService implements studentInter{
	
	@Autowired
	studentRepo repo;
	
	@Override
	public List<Student> getStudents() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Student getStudent(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}

	@Override
	public Student addStudent( Student student) {
		// TODO Auto-generated method stub
		return repo.save(student);
	}

	@Override
	public String deleteStudent(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
		return "Deleted";
	}

	@Override
	public Student updateStudent(int id, Student std) {
		// TODO Auto-generated method stub
		std.setId(id);
		return repo.save(std);
	}
	
}
