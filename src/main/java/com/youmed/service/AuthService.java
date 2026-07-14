package com.youmed.service;

import com.youmed.dto.request.LoginRequest;
import com.youmed.dto.request.RegisterRequest;
import com.youmed.dto.response.LoginResponse;
import com.youmed.dto.response.RegisterResponse;

public interface AuthService {

    RegisterResponse register(RegisterRequest request);

    LoginResponse login(LoginRequest request);
}