package com.nirmaan.springAssessment.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nirmaan.springAssessment.entities.Address;

@Repository
public interface addressRepo extends JpaRepository<Address, Integer>{

}
