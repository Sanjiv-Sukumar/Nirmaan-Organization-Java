package com.nirmaan.studentAddress.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Department {
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String description;
	
	
	//one department can have many students
	@OneToMany(cascade = {CascadeType.DETACH , CascadeType.PERSIST} ,mappedBy = "dpt")
	@JsonManagedReference
	List<Student> students;
	
	
	public Department(int id, String name, String description, List<Student> students) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.students = students;
	}
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
