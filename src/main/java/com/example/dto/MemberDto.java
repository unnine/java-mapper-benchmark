package com.example.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class MemberDto {
    private String name;
    private int age;
    private Phone phone;
    private Item address;
    private List<Order> orders;
    private String introduction;
}
