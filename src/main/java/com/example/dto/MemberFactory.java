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
        List<Order> orders = createOrders(10);

        Member member = new Member();
        member.setName(randomString());
        member.setAge(20);
        member.setPhone(phone);
        member.setAddress(address);
        member.setOrders(orders);
        member.setIntroduction(randomString());
        return member;
    }

    private List<Order> createOrders(int size) {
        List<Order> result = new ArrayList<>(size);
        List<Item> items = createItems(10);

        for(int i = 0; i < size; ++i) {
            Payment payment = new Payment(i, 3000, LocalDateTime.now());
            Order order = new Order();
            order.setId(i);
            order.setPayment(payment);
            order.setItems(items);
            order.setCreatedAt(LocalDateTime.now());
            result.add(order);
        }
        return result;
    }

    private List<Item> createItems(int size) {
        List<Item> result = new ArrayList<>(size);
        Item item;
        for(int i = 0; i < size; ++i) {
            item = new Item();
            item.setId(i);
            item.setName(randomString());
            item.setPrice(1000);
            item.setIntroduction(randomString());
            item.setCreatedAt(LocalDateTime.now());
            result.add(item);
        }
        return result;
    }

    private String randomString() {
        return UUID.randomUUID().toString();
    }
}