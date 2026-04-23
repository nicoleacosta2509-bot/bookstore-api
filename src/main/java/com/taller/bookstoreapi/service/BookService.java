package com.taller.bookstoreapi.service;

import com.taller.bookstoreapi.entity.Book;

import java.util.List;

public interface BookService {

    Book create(Book book);

    Book update(Long id, Book book);

    void delete(Long id);

    Book findById(Long id);

    List<Book> findAll();
}