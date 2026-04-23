package com.taller.bookstoreapi.controller;

import com.taller.bookstoreapi.dto.request.LoginRequest;
import com.taller.bookstoreapi.dto.request.RegisterRequest;
import com.taller.bookstoreapi.dto.response.ApiResponse;
import com.taller.bookstoreapi.dto.response.AuthResponse;
import com.taller.bookstoreapi.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping("/register")
    public ApiResponse<AuthResponse> register(@RequestBody RegisterRequest request) {

        AuthResponse response = authService.register(request);

        return ApiResponse.<AuthResponse>builder()
                .status("success")
                .code(200)
                .message("User registered")
                .data(response)
                .timestamp(LocalDateTime.now())
                .build();
    }

    @PostMapping("/login")
    public ApiResponse<AuthResponse> login(@RequestBody LoginRequest request) {

        AuthResponse response = authService.login(request);

        return ApiResponse.<AuthResponse>builder()
                .status("success")
                .code(200)
                .message("Login successful")
                .data(response)
                .timestamp(LocalDateTime.now())
                .build();
    }
}
