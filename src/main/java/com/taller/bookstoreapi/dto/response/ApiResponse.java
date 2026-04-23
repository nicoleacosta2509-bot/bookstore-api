package com.taller.bookstoreapi.dto.response;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class ApiResponse<T> {

    private String status;
    private int code;
    private String message;
    private T data;
    private LocalDateTime timestamp;
}
