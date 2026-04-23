package com.taller.bookstoreapi.dto.response;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class OrderItemResponse {

    private String bookTitle;
    private Integer quantity;
    private BigDecimal subtotal;
}