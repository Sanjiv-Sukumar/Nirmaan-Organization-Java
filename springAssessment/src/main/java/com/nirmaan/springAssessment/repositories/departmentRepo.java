package com.nirmaan.springAssessment.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nirmaan.springAssessment.entities.Department;

@Repository
public interface departmentRepo extends JpaRepository<Department, Integer> {

}
