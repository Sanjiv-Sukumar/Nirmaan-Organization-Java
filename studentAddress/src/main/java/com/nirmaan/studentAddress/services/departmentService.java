package com.nirmaan.studentAddress.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nirmaan.studentAddress.entities.Department;
import com.nirmaan.studentAddress.entities.Student;
import com.nirmaan.studentAddress.repositories.departmentRepo;


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
		// TODO Auto-generated method stub
		repo.deleteById(id);
		return "Deleted";
	}

	@Override
	public Department getDepartmentById(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}

}
