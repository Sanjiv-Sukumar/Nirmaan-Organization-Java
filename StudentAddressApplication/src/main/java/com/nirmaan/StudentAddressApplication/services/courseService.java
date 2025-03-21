package com.nirmaan.StudentAddressApplication.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nirmaan.StudentAddressApplication.entities.Course;
import com.nirmaan.StudentAddressApplication.entities.Student;
import com.nirmaan.StudentAddressApplication.repositories.courseRepo;

@Service
public class courseService implements courseInter {
	
	@Autowired
	courseRepo repo;
	
	@Override
	public Course addCourse(Course course) {
		
		if(course.getStds()!=null) {
		for(Student std : course.getStds()) {
			std.setCourse(course);
		}
		}
		return repo.save(course);
	}

	@Override
	public List<Course> getCourses() {
		return repo.findAll();
	}

	@Override
	public Course updateCourse(int id, Course course) {
		course.setId(id);
		return repo.save(course);
	}

	@Override
	public Course getCourseById(int id) {
		return repo.findById(id).get();
	}

	@Override
	public String deleteCourse(int id) {
	Course course = repo.findById(id).get();
		for(Student std :course.getStds())
		{
			std.setCourse(null);
		}
		repo.save(course);
		repo.deleteById(id);
		return "Deleted";
	}

}
