package com.example.frontservice.client.social;

import com.example.frontservice.dto.oauth.GoogleTokenResponseDTO;
import com.example.frontservice.dto.oauth.KakaoTokenResponseDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="googleTokenClient", url="https://oauth2.googleapis.com/token")
public interface GoogleTokenClient {

    @PostMapping(consumes = "application/x-www-form-urlencoded", produces = "application/json")
    GoogleTokenResponseDTO getTokens(
            @RequestParam("code") String code,
            @RequestParam("client_id") String clientId,
            @RequestParam("client_secret") String clientSecret,
            @RequestParam("redirect_uri") String redirectUri,
            @RequestParam("grant_type") String grantType
    );

    @PostMapping(consumes = "application/x-www-form-urlencoded", produces = "application/json")
    GoogleTokenResponseDTO getReAccessToken(
            @RequestParam("client_id") String clientId,
            @RequestParam("client_secret") String clientSecret,
            @RequestParam("refresh_token") String refreshToken,
            @RequestParam("grant_type") String grantType
    );
}
