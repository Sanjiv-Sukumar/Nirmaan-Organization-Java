package com.nirmaan.LibraryManagementSystem.controllers;

import org.springframework.web.bind.annotation.*;

import com.nirmaan.LibraryManagementSystem.entities.Penalty;
import com.nirmaan.LibraryManagementSystem.services.PenaltyService;

import java.util.List;

@RestController
@RequestMapping("/penalties")
public class PenaltyController {

    private final PenaltyService penaltyService;

    public PenaltyController(PenaltyService penaltyService) {
        this.penaltyService = penaltyService;
    }
    
    @GetMapping("getPenalties")
    public List<Penalty> getUnpaidPenalties() {
    	return penaltyService.getUnpaidPenalties();
    }
    
//    @PostMapping("applyPenalty/{userId}/{loanId}")
//    public Penalty applyPenalty(
//        @PathVariable Long userId,
//        @PathVariable Long loanId,
//        @RequestBody Penalty penaltyRequest // Accept JSON request body
//    ) {
//        return penaltyService.applyPenalty(userId, loanId, penaltyRequest);
//    }
    
    @PostMapping("applyPenalty/{userId}/{loanId}")
    public Penalty applyPenalty(@PathVariable Long userId, @PathVariable Long loanId) {
        return penaltyService.applyPenalty(userId, loanId);
    }




    // ⿤ *Get penalties by user ID*
    @GetMapping("getPenalty/{userId}")
    public Penalty getPenaltiesByUser(@PathVariable Long userId) {
        return penaltyService.getPenaltiesByUser(userId);
    }
    
    @DeleteMapping("deletePenalty/{id}")
    public void deletePenalty(@PathVariable Long id) {
    	penaltyService.deletePenalty(id);
    }
    
}
