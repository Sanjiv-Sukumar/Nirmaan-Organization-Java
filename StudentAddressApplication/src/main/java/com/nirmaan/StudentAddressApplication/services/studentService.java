package com.nirmaan.StudentAddressApplication.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nirmaan.StudentAddressApplication.entities.Student;
import com.nirmaan.StudentAddressApplication.repositories.studentRepo;

@Service
public class studentService implements studentInter{

	@Autowired
	studentRepo repo;

	@Override
	public Student addStudent(Student student) {
		return repo.save(student);
	}

	@Override
	public List<Student> getStudents() {
		return repo.findAll();
	}

	@Override
	public Student updateStudent(int id, Student student) {
		student.setId(id);
		return repo.save(student);
	}

	@Override
	public Student getStudentById(int id) {
		return repo.findById(id).get();
	}

	@Override
	public String deleteStudent(int id) {
		repo.deleteById(id);
		return "Deleted";
	}
	
	
}
