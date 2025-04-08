package com.nirmaan.LibraryManagementSystem.services;

import com.nirmaan.LibraryManagementSystem.entities.Loan;
import java.util.List;

public interface LoanInter {
	public List<Loan> getAllLoans();
	public Loan getLoanById(Long id);
	public Loan saveLoan(Loan loan);
	public void deleteLoan(Long id);
	public Loan updateBook(Loan loan ,Long id);
}
