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

import com.nirmaan.StudentAddressApplication.entities.Course;
import com.nirmaan.StudentAddressApplication.services.courseService;

@RestController
@RequestMapping("course")
public class courseController {
	
	@Autowired
	courseService ser;
	
	@PostMapping("addCourse")
	public Course addCourse(@RequestBody Course c) {
		return ser.addCourse(c);
	}
	
	@GetMapping("getCourses")
	public List<Course> getCourses(){
		return ser.getCourses();
	}
	
	@PutMapping("updateCourse/{id}")
	public Course updateCourse(@PathVariable int id , @RequestBody Course course) {
		return ser.updateCourse(id, course);
	}
	
	@GetMapping("getCourse/{id}")
	public Course getCourseById(@PathVariable int id) {
		return ser.getCourseById(id);
	}
	
	
	@DeleteMapping("deleteCourse/{id}")
	public String deleteCourse(@PathVariable int id) {
		ser.deleteCourse(id);
		return "Deleted";
	}
	
}
