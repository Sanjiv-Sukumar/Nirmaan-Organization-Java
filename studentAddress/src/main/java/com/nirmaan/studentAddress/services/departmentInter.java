package com.nirmaan.studentAddress.services;

import java.util.List;

import com.nirmaan.studentAddress.entities.Department;

public interface departmentInter {
	
	public Department addDepartment(Department dpt);
	public List<Department> getDepartments();
	public Department updateDepartment(int id , Department dpt);
	public String deleteDepartment(int id);
	public Department getDepartmentById(int id);

}
