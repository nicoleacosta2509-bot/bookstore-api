package com.taller.bookstoreapi.dto.response;

import lombok.*;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class OrderResponse {

    private Long id;
    private String status;
    private BigDecimal total;
    private List<OrderItemResponse> items;
}
