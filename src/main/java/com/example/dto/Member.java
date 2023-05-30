package com.example.dto;

import lombok.Builder;

import java.util.List;

public record Member(
        String name,
        int age,
        Phone phone,
        Address address,
        List<Order> orders,
        String introduction
) {

    @Builder
    public Member(String name, int age, Phone phone, Address address, List<Order> orders, String introduction) {
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.address = address;
        this.orders = orders;
        this.introduction = introduction;
    }
}
