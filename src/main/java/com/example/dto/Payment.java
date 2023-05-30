package com.example.dto;

import java.time.LocalDateTime;

public record Payment(
        Integer id,
        int price,
        LocalDateTime createdAt
) {
}
