package com.nirmaan.LibraryManagementSystem.services;

import java.util.List;
import com.nirmaan.LibraryManagementSystem.entities.Book;

public interface BookInter {
	
	 public List<Book> getAllBooks();
	 public Book getBookById(Long id);
	 public Book saveBook(Book book);
	 public void deleteBook(Long id);
	 public Book updateBook(Book book ,Long id);

}
