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
        return authClient.getUserInfo("Bearer " + token);
    }

    public LogoutResponseDTO logout(String token) {
        return authClient.logout(token);
    }

    public LogoutResponseDTO deleteAccount(String token) {
        return authClient.deleteAccount(token);
    }
}
