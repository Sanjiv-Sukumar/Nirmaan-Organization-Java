package com.nirmaan.StudentAddressApplication.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

	@Entity
	public class Student {
	    
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
		private String name;
		private int age;
		private long phoneNo;
		
		@ManyToOne
		@JsonBackReference
		Course course;
		
		
		

		public Student(int id, String name, int age, long phoneNo, Course course) {
			super();
			this.id = id;
			this.name = name;
			this.age = age;
			this.phoneNo = phoneNo;
			this.course = course;
		}
		
		
		public Course getCourse() {
			return course;
		}


		public void setCourse(Course course) {
			this.course = course;
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
		public long getPhoneNo() {
			return phoneNo;
		}
		public void setPhoneNo(long phoneNo) {
			this.phoneNo = phoneNo;
		}
		
		
}
