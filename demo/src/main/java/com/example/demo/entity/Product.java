package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private double price;

    @Enumerated(EnumType.STRING)
    private Currency currency;

    public enum Currency{
        USD, GBP, EUR
    }
}
