package com.nirmaan.springAssessment.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nirmaan.springAssessment.entities.Department;
import com.nirmaan.springAssessment.entities.Student;
import com.nirmaan.springAssessment.repositories.departmentRepo;




@Service
public class departmentService implements departmentInter{
	
	@Autowired
	departmentRepo repo;

	@Override
	public Department addDepartment(Department dpt) {
		if(dpt.getStudents()!= null ) {
			for(Student std : dpt.getStudents()) {
				std.setDpt(dpt);
			}
		}
		return repo.save(dpt);
	}

	@Override
	public List<Department> getDepartments() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Department updateDepartment(int id, Department dpt) {
		// TODO Auto-generated method stub
		dpt.setId(id);
		return repo.save(dpt);
	}

	@Override
	public String deleteDepartment(int id) {
		Department dpt = repo.findById(id).get();
		for(Student std :dpt.getStudents())
		{
			std.setDpt(null);
		}
		repo.save(dpt);
		repo.deleteById(id);
		return "Deleted";
	}
	

	@Override
	public Department getDepartmentById(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}

}