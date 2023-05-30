package com.example.dto;

import lombok.Builder;

import java.time.LocalDateTime;
import java.util.List;

public record Order(
        Integer id,
        Payment payment,
        List<Item> items,
        LocalDateTime createdAt
) {

    @Builder
    public Order {
    }
}
