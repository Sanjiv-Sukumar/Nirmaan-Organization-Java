package com.nirmaan.LibraryManagementSystem.services;

import java.util.List;

import com.nirmaan.LibraryManagementSystem.entities.Penalty;

public interface PenaltyInter {
     
	public List<Penalty> getPenaltiesByUser(Long userId);
	public Penalty applyPenalty(Long userId, Long loanId);
	public List<Penalty> getUnpaidPenalties();
}
