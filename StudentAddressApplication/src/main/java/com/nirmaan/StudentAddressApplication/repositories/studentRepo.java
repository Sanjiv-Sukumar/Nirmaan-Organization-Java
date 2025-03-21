package com.nirmaan.StudentAddressApplication.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nirmaan.StudentAddressApplication.entities.Student;

@Repository
public interface studentRepo extends JpaRepository<Student, Integer> {

}
