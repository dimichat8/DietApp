package com.example.plan.security.auth.service;

import com.example.plan.security.auth.AuthRequest;
import com.example.plan.security.auth.LogoutRequest;
import com.example.plan.user.entity.UserInfo;
import org.springframework.http.ResponseEntity;

public interface AuthService {

    ResponseEntity<String> generateToken(AuthRequest authRequest);

    ResponseEntity<String> login(AuthRequest authRequest);

    ResponseEntity<String> auth(AuthRequest authRequest);

    ResponseEntity<String> logout(LogoutRequest logoutRequest);

}
