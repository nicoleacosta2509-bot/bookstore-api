package com.taller.bookstoreapi.repository;

import com.taller.bookstoreapi.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
