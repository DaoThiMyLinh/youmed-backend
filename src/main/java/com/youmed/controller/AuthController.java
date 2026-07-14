package com.youmed.controller;

import com.youmed.dto.request.LoginRequest;
import com.youmed.dto.request.RegisterRequest;
import com.youmed.dto.response.LoginResponse;
import com.youmed.dto.response.RegisterResponse;
import com.youmed.service.AuthService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
@Tag(name = "Authentication", description = "Endpoints for user authentication")
public class AuthController {

    private final AuthService authService;

    @PostMapping("/register")
    public RegisterResponse register(@Valid @RequestBody RegisterRequest request) {
        return authService.register(request);
    }

    @PostMapping("/login")
    public LoginResponse login(@Valid @RequestBody LoginRequest request) {
        return authService.login(request);
    }
}