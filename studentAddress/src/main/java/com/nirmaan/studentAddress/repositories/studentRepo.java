package com.nirmaan.studentAddress.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nirmaan.studentAddress.entities.Student;

@Repository
public interface studentRepo extends JpaRepository<Student, Integer>{

}
