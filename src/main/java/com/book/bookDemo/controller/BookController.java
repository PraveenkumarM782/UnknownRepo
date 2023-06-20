package com.book.bookDemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.book.bookDemo.entity.Book;
import com.book.bookDemo.repository.BookRepository;

@RestController
public class BookController {
	@Autowired
	BookRepository bk;
	@PostMapping("/booksave")
	
	public String insertBook(Book book) {
		return "Your record is saved successfully";
		
	}
}
