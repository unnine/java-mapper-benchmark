package com.example.dto;

import java.util.List;

public class MemberDto {
    private String name;
    private int age;
    private Phone phone;
    private Item address;
    private List<Order> orders;
    private String introduction;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public Item getAddress() {
        return address;
    }

    public void setAddress(Item address) {
        this.address = address;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    @Override
    public String toString() {
        return "MemberDto{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phone=" + phone +
                ", address=" + address +
                ", orders=" + orders +
                ", introduction='" + introduction + '\'' +
                '}';
    }
}