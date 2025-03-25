package com.nirmaan.springAssessment.controller;


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

import com.nirmaan.springAssessment.entities.Department;
import com.nirmaan.springAssessment.services.departmentService;


@RestController
@RequestMapping("department")
public class departmentController {
	
	@Autowired
	departmentService dptSer;
	
	@PostMapping("addDepartment")
	public Department addDepartment(@RequestBody Department dpt) {
		return dptSer.addDepartment(dpt);
	}
	
	@GetMapping("getDepartments")
	public List<Department> getDepartments(){
		return dptSer.getDepartments();
	}
	
	@PutMapping("updateDepartment/{id}")
	public Department updateStudent(@PathVariable int id ,@RequestBody Department dpt) {
		return dptSer.updateDepartment(id, dpt);
	}
	
	@DeleteMapping("deleteDepartment/{id}")
	public String deleteDepartment(@PathVariable int id) {
		
		return dptSer.deleteDepartment(id);
	}
	
	@GetMapping("getDepartment/{id}")
	public Department getDepartment(@PathVariable int id) {
		return dptSer.getDepartmentById(id);
	}
     
}