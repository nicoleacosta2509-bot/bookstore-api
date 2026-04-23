package com.taller.bookstoreapi.repository;

import com.taller.bookstoreapi.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
