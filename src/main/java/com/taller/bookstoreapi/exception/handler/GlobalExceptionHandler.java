package com.taller.bookstoreapi.exception.handler;

import com.taller.bookstoreapi.dto.response.ApiErrorResponse;
import com.taller.bookstoreapi.exception.custom.*;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestControllerAdvice
public class GlobalExceptionHandler {

    private ApiErrorResponse build(HttpStatus status, String message,
                                   List<String> errors, HttpServletRequest req) {
        return ApiErrorResponse.builder()
                .status("error")
                .code(status.value())
                .message(message)
                .errors(errors)
                .timestamp(LocalDateTime.now())
                .path(req.getRequestURI())
                .build();
    }
    @ExceptionHandler
    @ResponseStatus
    public ApiErrorResponse handleNotFound(ResourceNotFoundException ex, HttpServletRequest req) {
        return build(HttpStatus.NOT_FOUND, ex.getMessage(), List.of(ex.getMessage()), req);
    }

    @ExceptionHandler
    @ResponseStatus
    public ApiErrorResponse handleDuplicate(DuplicateResourceException ex, HttpServletRequest req) {
        return build(HttpStatus.CONFLICT, ex.getMessage(), List.of(ex.getMessage()), req);
    }

    @ExceptionHandler
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ApiErrorResponse handleStock(InsufficientStockException ex, HttpServletRequest req) {
        return build(HttpStatus.BAD_REQUEST, ex.getMessage(), List.of(ex.getMessage()), req);
    }
}
