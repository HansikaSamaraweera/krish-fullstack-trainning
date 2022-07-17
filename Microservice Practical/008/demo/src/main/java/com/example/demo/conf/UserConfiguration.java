package com.example.demo.conf;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configuration.GlobalAuthenticationConfigurerAdapter;

@Configuration
public class UserConfiguration extends GlobalAuthenticationConfigurerAdapter {

    @Override
    public void init(AuthenticationManagerBuilder)throws Exception{
        auth.inMemoryAuthenticaiton().withUser("Hansi").password("H123").roles("USER","ADMIN","MANAGER").authorities("CAN_READ","CAN_WRITE").and().withUser("Hansi").password("H123").roles("USER","ADMIN","MANAGER").authorities("CAN_READ","CAN_WRITE");
    }
}
