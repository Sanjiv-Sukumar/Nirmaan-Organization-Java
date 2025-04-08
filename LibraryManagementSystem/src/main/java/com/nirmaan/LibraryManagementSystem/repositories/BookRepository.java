package com.nirmaan.LibraryManagementSystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nirmaan.LibraryManagementSystem.entities.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
}
