package com.ecommerceweboneapi.restapi.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfiguration {

    // @Override
    // protected void configure(AuthenticationManagerBuilder auth) throws Exception {
    //     super.configure(auth);
    // }
    
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
        http.csrf()
            .disable()
            .authorizeRequests()
            .antMatchers("/users/create", "/users/create/**")
            .permitAll()
            .and()
            .httpBasic();
        return http.build();
    }

}
