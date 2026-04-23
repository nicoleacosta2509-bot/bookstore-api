package com.taller.bookstoreapi.repository;

import com.taller.bookstoreapi.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
