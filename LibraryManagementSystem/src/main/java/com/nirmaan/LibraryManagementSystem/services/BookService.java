package com.nirmaan.LibraryManagementSystem.services;


import com.nirmaan.LibraryManagementSystem.entities.Book;
import com.nirmaan.LibraryManagementSystem.repositories.BookRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService implements BookInter{
    @Autowired
    private BookRepository bookRepository;

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Book getBookById(Long id) {
        return bookRepository.findById(id).orElse(null);
    }

    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }

    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }
    
    public Book updateBook(Book book ,Long id) {
    	book.setId(id);
    	return bookRepository.save(book);
    }
}

