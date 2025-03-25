package com.nirmaan.springAssessment.entities;


import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Student {
    
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private int age;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "Address_id")
	Address address;
	
	//many students can join in one department
	@ManyToOne
	@JoinColumn(name = "department_id")
	@JsonBackReference
	Department dpt;
	
	
	public Student(int id, String name, int age, Address address, Department dpt) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.address = address;
		this.dpt = dpt;
	}
	
	
	public Department getDpt() {
		return dpt;
	}


	public void setDpt(Department dpt) {
		this.dpt = dpt;
	}


	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Student() {
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
