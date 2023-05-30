package com.example.dto;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class MemberFactory {

    public List<Member> createList(int size) {
        List<Member> result = new ArrayList<>(size);
        for(int i = 0; i < size; i++) {
            result.add(create());
        }
        return result;
    }

    public Member create() {
        Phone phone = new Phone(randomString(), randomString(), randomString());
        Address address = new Address(randomString(), randomString(), randomString());
        List<Order> orders = createOrders(20);

        return Member.builder()
                .name(randomString())
                .age(20)
                .phone(phone)
                .address(address)
                .orders(orders)
                .introduction(randomString())
                .build();
    }

    private List<Order> createOrders(int size) {
        List<Order> result = new ArrayList<>(size);
        List<Item> items = createItems(10);

        for(int i = 0; i < size; ++i) {
            Payment payment = new Payment(i, 3000, LocalDateTime.now());
            Order order = Order.builder()
                    .id(i)
                    .payment(payment)
                    .items(items)
                    .createdAt(LocalDateTime.now())
                    .build();
            result.add(order);
        }
        return result;
    }

    private List<Item> createItems(int size) {
        List<Item> result = new ArrayList<>(size);
        Item item;
        for(int i = 0; i < size; ++i) {
            item = Item.builder()
                    .id(i)
                    .name(randomString())
                    .price(1000)
                    .introduction(randomString())
                    .createdAt(LocalDateTime.now())
                    .build();
            result.add(item);
        }
        return result;
    }

    private String randomString() {
        return UUID.randomUUID().toString();
    }
}
