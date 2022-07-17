package com.example.demo.conf;

import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class AuthServerConfigurations extends WebSecurityConfigurerAdapter implements AuthorizationServerConfigure {

    @Bean
    public AuthenticationManager authenticationManagerBean() throws Exception{
        return super.authenticationManagerBean();
    }
    @Autowired
    AuthenticationManager authenticationManager;
    PasswordEncoder passwordEncoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();

    @Override
    protected void configure(AuthorizationServerConfigure security) throws Exception {

    security.checkTockenAccess("permitAll()");
    }
    @Override
    protected void configure(AuthorizationServerConfigure client) throws Exception {

        client.inMemory().withClient("web").secret("webpass").scopes("READ","WRITE").authenticationGrantTypes("password","authentication");

    }
    @Override
    protected void configure(AuthorizationServerConfigure endpoint) throws Exception {
        endpoint.authernticaitonManager(authenticationManager);
    }
}
