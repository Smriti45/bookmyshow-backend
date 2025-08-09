package com.example.bookMyShow.config;

import org.springframework.stereotype.Component;

import java.util.Base64;

@Component
public class JWTUtil {
    public String generateToken(String userId) {
        return Base64.getEncoder().encodeToString((userId + ":jwt").getBytes());
    }

    public String extractUserId(String token) {
        return new String(Base64.getDecoder().decode(token)).split(":")[0];
    }
}
