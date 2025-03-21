package com.nirmaan.StudentAddressApplication.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Course {
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private double fees;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "course")
	@JsonManagedReference
	List<Student> stds;
	
	
	public Course(int id, String name, double fees, List<Student> stds) {
		super();
		this.id = id;
		this.name = name;
		this.fees = fees;
		this.stds = stds;
	}
	public Course() {
		super();
		// TODO Auto-generated constructor stub
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
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
	public List<Student> getStds() {
		return stds;
	}
	public void setStds(List<Student> stds) {
		this.stds = stds;
	}
	
	
}
