package com.nirmaan.LibraryManagementSystem.controllers;

import com.nirmaan.LibraryManagementSystem.entities.Loan;
import com.nirmaan.LibraryManagementSystem.services.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("loans")
public class LoanController {
    @Autowired
    private LoanService loanService;

    @GetMapping("getLoans")
    public List<Loan> getAllLoans() {
        return loanService.getAllLoans();
    }

    @GetMapping("getLoan/{id}")
    public Loan getLoanById(@PathVariable Long id) {
        return loanService.getLoanById(id);
    }

    @PostMapping("addLoan")
    public Loan saveLoan(@RequestBody Loan loan) {
        return loanService.saveLoan(loan);
    }
    
    @PutMapping("updateLoan/{id}")
    public Loan updateLoan(@RequestBody Loan loan ,@PathVariable Long id) {
    	return loanService.updateLoan(loan, id);
    }

    @DeleteMapping("deleteLoan/{id}")
    public void deleteLoan(@PathVariable Long id) {
        loanService.deleteLoan(id);
    }
}

