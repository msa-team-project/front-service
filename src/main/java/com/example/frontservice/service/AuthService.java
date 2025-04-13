package com.example.frontservice.service;

import com.example.frontservice.client.edge.AuthClient;
import com.example.frontservice.dto.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {
    private final AuthClient authClient;

    public JoinClientResponseDTO join(JoinRequestDTO joinRequestDTO) {
        return authClient.join(joinRequestDTO);
    }

    public LoginClientResponseDTO login(LoginRequestDTO loginRequestDTO) {
        return authClient.login(loginRequestDTO);
    }

    public UserInfoResponseDTO getUserInfo(String token) {
        return authClient.getUserInfo(token);
    }
}
