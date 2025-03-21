package com.nirmaan.StudentAddressApplication.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nirmaan.StudentAddressApplication.entities.Course;

@Repository
public interface courseRepo extends JpaRepository<Course, Integer> {

}
