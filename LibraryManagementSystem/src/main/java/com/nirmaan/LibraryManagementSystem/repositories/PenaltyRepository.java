package com.nirmaan.LibraryManagementSystem.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.nirmaan.LibraryManagementSystem.entities.Penalty;

public interface PenaltyRepository extends JpaRepository<Penalty, Long> {
    

}
