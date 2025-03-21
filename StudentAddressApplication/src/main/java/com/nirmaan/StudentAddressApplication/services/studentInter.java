package com.nirmaan.StudentAddressApplication.services;

import java.util.List;

import com.nirmaan.StudentAddressApplication.entities.Student;

public interface studentInter {
	public Student addStudent(Student student);
	public List<Student> getStudents();
	public Student updateStudent(int id , Student student);
	public Student getStudentById(int id);
	public String deleteStudent(int id);
}
