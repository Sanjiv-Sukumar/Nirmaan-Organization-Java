package com.nirmaan.studentAddress.services;

import java.util.List;

import com.nirmaan.studentAddress.entities.Student;

public interface studentInter {
    
	public Student addStudent(Student std);
	public List<Student> getStudents();
	public Student updateStudent(int id , Student std);
	public String deleteStudent(int id);
	public Student getStudentById(int id);
	
}
