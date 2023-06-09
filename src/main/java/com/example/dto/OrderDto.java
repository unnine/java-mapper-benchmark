package com.example.dto;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class OrderDto {
    private Integer id;
    private Payment payment;
    private List<ItemDto> items;
    private LocalDateTime createdAt;

    public static OrderDto from(Order order) {
        List<ItemDto> items = new ArrayList<>(order.getItems().size());
        for (Item item : order.getItems()) {
            items.add(ItemDto.from(item));
        }

        OrderDto dto = new OrderDto();
        dto.setId(order.getId());
        dto.setPayment(order.getPayment());
        dto.setItems(items);
        dto.setCreatedAt(order.getCreatedAt());
        return dto;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public List<ItemDto> getItems() {
        return items;
    }

    public void setItems(List<ItemDto> items) {
        this.items = items;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "OrderDto{" +
                "id=" + id +
                ", payment=" + payment +
                ", items=" + items +
                ", createdAt=" + createdAt +
                '}';
    }
}