package com.example.demo.Entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    private String username;

    private String password;

    @Enumerated(EnumType.STRING)
    private EncrytionAlgorithm algorithm;

    @OneToMany(mappedBy = "user", fetch = FetchType.EAGER)
    private List<Authority> authorities;

    public enum EncrytionAlgorithm {
        BCRYPT, SCRYPT
    }
}
