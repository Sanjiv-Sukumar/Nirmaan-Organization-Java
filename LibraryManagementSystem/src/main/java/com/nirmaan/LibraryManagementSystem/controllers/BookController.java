package com.nirmaan.LibraryManagementSystem.controllers;


import com.nirmaan.LibraryManagementSystem.entities.Book;
import com.nirmaan.LibraryManagementSystem.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("books")
public class BookController {
	
    @Autowired
    private BookService bookService;

    @GetMapping("getBooks")
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @GetMapping("getBook/{id}")
    public Book getBookById(@PathVariable Long id) {
        return bookService.getBookById(id);
    }

    @PostMapping("addBook")
    public Book saveBook(@RequestBody Book book) {
        return bookService.saveBook(book);
    }
    
    @PutMapping("updateBook/{id}")
    public Book updateBook(@RequestBody Book book ,@PathVariable Long id) {
    	return bookService.updateBook(book, id);
    }

    @DeleteMapping("deleteBook/{id}")
    public void deleteBook(@PathVariable Long id) {
        bookService.deleteBook(id);
    }
}
