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
    public Item {
    }
}
