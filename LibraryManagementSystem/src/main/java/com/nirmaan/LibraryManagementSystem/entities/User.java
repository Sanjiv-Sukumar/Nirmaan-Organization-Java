package com.nirmaan.LibraryManagementSystem.entities;


import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;

@Entity
public class User {
	
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String name;
	    private String email;

	    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
	    @JsonIgnore  // This allows serialization of the list of loans
	   private List<Loan> loans;  //one user can have many loans
	    
	    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
	    private List<Penalty> penalties;

    
    
	public User(Long id, String name, String email, List<Loan> loans) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.loans = loans;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	// Getters and Setters
	
	public List<Loan> getLoans() {
		return loans;
	}

	public void setLoans(List<Loan> loans) {
		this.loans = loans;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}

