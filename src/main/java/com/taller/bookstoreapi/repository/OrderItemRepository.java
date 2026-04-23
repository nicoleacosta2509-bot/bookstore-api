package com.taller.bookstoreapi.repository;

import com.taller.bookstoreapi.entity.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
