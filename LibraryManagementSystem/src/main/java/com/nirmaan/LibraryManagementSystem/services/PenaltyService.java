package com.nirmaan.LibraryManagementSystem.services;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nirmaan.LibraryManagementSystem.entities.User;
import com.nirmaan.LibraryManagementSystem.entities.Loan;
import com.nirmaan.LibraryManagementSystem.entities.Penalty;
import com.nirmaan.LibraryManagementSystem.repositories.LoanRepository;
import com.nirmaan.LibraryManagementSystem.repositories.PenaltyRepository;
import com.nirmaan.LibraryManagementSystem.repositories.UserRepository;

@Service
public class PenaltyService {
    
    @Autowired
    private PenaltyRepository penaltyRepository;
    
    @Autowired
    private LoanRepository loanRepository;
    
    @Autowired
    private UserRepository userRepository;

    
    public Penalty getPenaltiesByUser(Long userId){
    	return penaltyRepository.findById(userId).get();
    }

    
    public Penalty applyPenalty(Long userId, Long loanId) {
        User user = userRepository.findById(userId).
        		orElseThrow(() -> new RuntimeException("User not found!"));
        Loan loan = loanRepository.findById(loanId).
        		orElseThrow(() -> new RuntimeException("User not found!"));

        LocalDate today = LocalDate.now();
        LocalDate dueDate = loan.getReturnDate(); // Loan return date is the due date

        long daysOverdue = ChronoUnit.DAYS.between(dueDate, today);

        if (daysOverdue > 0 && loan.isReturned() == false) {
            double penaltyAmount = daysOverdue * 5; // Fine is $5 per day

            Penalty penalty = new Penalty();
            penalty.setUser(user);
            penalty.setLoan(loan);
            penalty.setAmount(penaltyAmount);
            penalty.setPaid(false);
            penalty.setAppliedDate(today);
            penalty.setDueDate(today.plusDays(7)); // User has 7 days to pay

            return penaltyRepository.save(penalty);
        } else {
            throw new RuntimeException("Loan is not overdue. No penalty required.");
        }
    }
    
   public void deletePenalty(Long id) {
	   penaltyRepository.deleteById(id);
   }


	public List<Penalty> getUnpaidPenalties() {
		// TODO Auto-generated method stub
		return penaltyRepository.findAll();
	}

}