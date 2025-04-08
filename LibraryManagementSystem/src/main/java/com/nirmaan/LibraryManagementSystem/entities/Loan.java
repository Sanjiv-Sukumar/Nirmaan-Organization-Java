package com.nirmaan.LibraryManagementSystem.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Loan {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate loanDate;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate returnDate;
    
    private boolean returned; // this field tracks if the book is returned

    @ManyToOne
    //@JsonBackReference  // Prevents infinite recursion when serializing User
    @JoinColumn(name = "user_id")
    private User user; //many loans belongs to one user;

    @ManyToOne
    //@JsonBackReference  // Prevents infinite recursion when serializing Book
    @JoinColumn(name = "book_id")
    private Book book;  // many loans belongs to one book


	public Loan(Long id, LocalDate loanDate, LocalDate returnDate,boolean returned, User user, Book book) {
		super();
		this.id = id;
		this.loanDate = loanDate;
		this.returnDate = returnDate;
		this.returned = returned;
		this.user = user;
		this.book = book;
	}

	public Loan() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	// Getters and Setters
	
	
	
	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
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

	public LocalDate getLoanDate() {
		return loanDate;
	}
	public void setLoanDate(LocalDate loanDate) {
		this.loanDate = loanDate;
	}
	public LocalDate getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(LocalDate returnDate) {
		this.returnDate = returnDate;
	}
	
	public boolean isReturned() {
		return returned;
	}
	
	public void setReturned(boolean returned) {
		this.returned = returned;
	}
 
}
