package com.nirmaan.studentAddress.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nirmaan.studentAddress.entities.Department;

public interface departmentRepo extends JpaRepository<Department, Integer> {

}
