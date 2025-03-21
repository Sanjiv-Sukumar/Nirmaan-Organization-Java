package com.nirmaan.studentAddress.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nirmaan.studentAddress.entities.Address;


@Repository
public interface addressRepo extends JpaRepository<Address, Integer>{

}
