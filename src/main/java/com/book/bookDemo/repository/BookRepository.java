  package com.book.bookDemo.repository;

import org.springframework.data.repository.CrudRepository;

import com.book.bookDemo.entity.Book;

public interface BookRepository extends CrudRepository<Book, Long>{

}
