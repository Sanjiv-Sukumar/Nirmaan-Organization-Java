package com.nirmaan.StudentAddressApplication.services;

import java.util.List;

import com.nirmaan.StudentAddressApplication.entities.Course;

public interface courseInter {
		public Course addCourse(Course course);
		public List<Course> getCourses();
		public Course updateCourse(int id , Course course);
		public Course getCourseById(int id);
		public String deleteCourse(int id);
		
}
