package com.Nirmaan.Pet.Adoption.Entity;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity 
@Table(name="AdoptionRequest")
public class AdoptionRequest {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private Date requestDate;
	private String status;
	
	@ManyToOne
	@JsonBackReference
	@JoinColumn(name = "pet_id")
	private Pet pet;
	
	@ManyToOne
	@JsonBackReference("user-request")
	@JoinColumn(name="user_id")
	private User user;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getRequestDate() {
		return requestDate;
	}
	public void setRequestDate(Date requestDate) {
		this.requestDate = requestDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public Pet getPet() {
		return pet;
	}
	public void setPet(Pet pet) {
		this.pet = pet;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	public AdoptionRequest(int id, Date requestDate, String status, Pet pet, User user) {
		super();
		this.id = id;
		this.requestDate = requestDate;
		this.status = status;
		this.pet = pet;
		this.user = user;
	}
	public AdoptionRequest() {
		super();
	}

}
