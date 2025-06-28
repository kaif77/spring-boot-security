package com.kaif.SpringBootSecurity.controller;

import com.kaif.SpringBootSecurity.model.LoginRequest;
import com.kaif.SpringBootSecurity.model.LoginResponse;
import com.kaif.SpringBootSecurity.security.JWTIssuer;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class AuthController {

    private final JWTIssuer jwtIssuer;

    @PostMapping("/auth/login")
    public LoginResponse login(@RequestBody @Validated LoginRequest request){
        var token = jwtIssuer.issue(1L, request.getEmail(), List.of("DEV"));
            return LoginResponse.builder().accessToken(token).build();
        //
    }
}
