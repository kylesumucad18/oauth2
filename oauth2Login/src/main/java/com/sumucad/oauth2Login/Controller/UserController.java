package com.sumucad.oauth2Login.Controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.Objects;

@RestController

public class UserController {
    @GetMapping
    public String index() {
        return "<h1>Welcome, This is the landing page</h1>";
    }

    @GetMapping("/user-info")
    public Map<String, Object> getUserProfile(@AuthenticationPrincipal OAuth2User oAuth2User) {
        return oAuth2User.getAttributes();
    }

    @GetMapping("/secured")
    public String securedEndpoint() {
        return "<h1>This is a secured Endpoint</h1>";
    }
}
