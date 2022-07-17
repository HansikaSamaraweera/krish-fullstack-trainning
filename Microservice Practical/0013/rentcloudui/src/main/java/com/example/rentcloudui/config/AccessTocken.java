package com.example.rentcloudui.config;

import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.provider.authentication.OAuth2AuthenticationDetails;

public class AccessTocken {

    public static String getAccessTocken(){
        OAuth2AuthenticationDetails auth2AuthenticationDetails = (OAuth2AuthenticationDetails) SecurityContextHolder.getContext().getAuthentication().getDetails();
        return auth2AuthenticationDetails.getTokenType().concat("").concat(auth2AuthenticationDetails.getTokenValue());
    }
}
