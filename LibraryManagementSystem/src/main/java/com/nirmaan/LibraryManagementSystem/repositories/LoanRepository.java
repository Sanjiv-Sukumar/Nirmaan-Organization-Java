package com.nirmaan.LibraryManagementSystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.nirmaan.LibraryManagementSystem.entities.Loan;

public interface LoanRepository extends JpaRepository<Loan, Long> {
}

