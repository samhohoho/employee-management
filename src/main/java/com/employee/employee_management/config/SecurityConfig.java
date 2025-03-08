package com.employee.employee_management.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {
    // @Bean
    // SecurityFilterChain configure(HttpSecurity http) throws Exception {
    //     http
    //             .authorizeHttpRequests((auth) -> auth
    //                     .anyRequest().authenticated())
    //             .httpBasic(Customizer.withDefaults())
    //             .csrf(csrf -> csrf.disable());
    //
    //     return http.build();
    // }
    //
    // @Bean
    // public UserDetailsService userDetailsService() {
    //     UserDetails userDetails = User.withDefaultPasswordEncoder()
    //             .username("user")
    //             .password("password")
    //             .roles("USER")
    //             .build();
    //
    //     return new InMemoryUserDetailsManager(userDetails);
    // }
}
