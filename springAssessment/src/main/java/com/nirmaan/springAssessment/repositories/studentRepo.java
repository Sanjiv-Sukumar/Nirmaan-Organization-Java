package com.nirmaan.springAssessment.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nirmaan.springAssessment.entities.Student;

@Repository
public interface studentRepo extends JpaRepository<Student,Integer> {

}
