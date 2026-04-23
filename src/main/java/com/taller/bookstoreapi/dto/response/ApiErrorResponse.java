package com.taller.bookstoreapi.dto.response;

import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class ApiErrorResponse {

    private String status;
    private int code;
    private String message;
    private List<String> errors;
    private LocalDateTime timestamp;
    private String path;
}