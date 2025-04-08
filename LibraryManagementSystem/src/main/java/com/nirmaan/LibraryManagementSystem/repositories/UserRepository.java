package com.nirmaan.LibraryManagementSystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.nirmaan.LibraryManagementSystem.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
}

