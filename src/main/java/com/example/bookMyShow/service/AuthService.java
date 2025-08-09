package com.example.bookMyShow.service;

import com.example.bookMyShow.config.JWTUtil;
import com.example.bookMyShow.dto.AuthResponse;
import com.example.bookMyShow.dto.LoginRequest;
import com.example.bookMyShow.dto.RegisterRequest;
import com.example.bookMyShow.model.User;
import com.example.bookMyShow.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;
@Service
public class AuthService {
    @Autowired private UserRepository userRepository;
    @Autowired private JWTUtil authUtil;
    public User register(RegisterRequest request) {
        User user = new User(UUID.randomUUID().toString(), request.getName(), request.getEmail(), request.getPassword(), request.getRole());
        return userRepository.save(user);
    }

    public AuthResponse login(LoginRequest request) {
        User user = userRepository.findByEmail(request.getEmail())
                .orElseThrow(() -> new RuntimeException("User Not Found!"));
        if(!user.getPassword().equals(request.getPassword())) {
            throw new RuntimeException("Invalid Password");
        }
        String token = authUtil.generateToken(user.getId());
        return new AuthResponse(token, user.getId());
    }
}
