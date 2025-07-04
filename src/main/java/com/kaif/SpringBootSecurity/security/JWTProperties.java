package com.kaif.SpringBootSecurity.security;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@Getter
@Setter
@ConfigurationProperties("secret.jwt")
public class JWTProperties {
    private String secretKey;
}
