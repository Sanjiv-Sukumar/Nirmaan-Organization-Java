package com.nirmaan.springAssessment.services;

import java.util.List;

import com.nirmaan.springAssessment.entities.Student;

public interface studentInter {
		public List<Student> getStudents();
		public Student getStudent(int id);
		public Student addStudent(Student student);
		public String deleteStudent(int id);
		public Student updateStudent(int id , Student std);
}
