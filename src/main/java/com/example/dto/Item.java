package com.example.dto;

import lombok.Builder;

import java.time.LocalDateTime;

public record Item(
        Integer id,
        String name,
        int price,
        String introduction,
        LocalDateTime createdAt
) {

    @Builder
    public Item(Integer id, String name, int price, String introduction, LocalDateTime createdAt) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.introduction = introduction;
        this.createdAt = createdAt;
    }
}
