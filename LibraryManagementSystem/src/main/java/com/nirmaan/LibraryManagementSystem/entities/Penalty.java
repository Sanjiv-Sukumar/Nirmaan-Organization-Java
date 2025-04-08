package com.nirmaan.LibraryManagementSystem.entities;


import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Penalty {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double amount; //fine amount
    private boolean paid; //Whether the fine is paid or not
    private LocalDate dueDate; // date by which the fine should be pain
    private LocalDate appliedDate; // date when the penalty was issued
	
    
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user; //multiple penalties applied for one users
    
    
    @ManyToOne
    @JoinColumn(name = "loan_id") // Ensure foreign key mapping
    private Loan loan;
    
    
    
	
	
	
	public Penalty(Long id, Double amount, boolean paid, LocalDate dueDate, LocalDate appliedDate, User user,
			Loan loan) {
		super();
		this.id = id;
		this.amount = amount;
		this.paid = paid;
		this.dueDate = dueDate;
		this.appliedDate = appliedDate;
		this.user = user;
		this.loan = loan;
	}


	public Loan getLoan() {
		return loan;
	}



	public void setLoan(Loan loan) {
		this.loan = loan;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}
    

	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}



	public LocalDate getAppliedDate() {
		return appliedDate;
	}



	public void setAppliedDate(LocalDate appliedDate) {
		this.appliedDate = appliedDate;
	}



	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public boolean isPaid() {
		return paid;
	}
	public void setPaid(boolean paid) {
		this.paid = paid;
	}
	public Penalty() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
    
    

}