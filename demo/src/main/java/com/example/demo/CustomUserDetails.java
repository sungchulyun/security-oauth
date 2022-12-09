package com.example.demo;

import com.example.demo.Entity.User;
import org.springframework.security.core.userdetails.UserDetails;

public interface CustomUserDetails extends UserDetails {

    private final User user;

}
