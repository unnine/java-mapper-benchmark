package com.example.dto;

import java.time.LocalDateTime;

public class Payment {
    private Integer id;
    private int price;
    private LocalDateTime createdAt;

    public Payment(Integer id, int price, LocalDateTime createdAt) {
        this.id = id;
        this.price = price;
        this.createdAt = createdAt;
    }
}